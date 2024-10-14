#!/bin/sh

# Make the script executable
if [ ! -x "$0" ]; then
    chmod +x "$0"
    exec "$0" "$@"
fi

# Default values
JAVA_VERSION="11"
OUTPUT_DIR="../adapter"
SPEC_FILES=""
PACKAGE_NAME="com.adapter"
SPEC_DIR="spec/spi"

# Function to update generator.config
update_generator_config() {
    local spec_file=$1
    local config_file="generator.config"

    # Update the specs in the config file
    sed -i "s/^specs:.*/specs:\n  - $spec_file/" "$config_file"
}

# Function to update spec.config
update_spec_config() {
    local spec_file=$1
    local config_file="spec.config"
    local spec_name=$(basename "$spec_file" .yml)

    # Create or overwrite the spec.config file with a single entry
    echo "{ name: \"$spec_name\", projectName: \"$spec_name\" }" > "$config_file"
}

# Parse command line arguments
while [ $# -gt 0 ]; do
    case "$1" in
        --java)
            JAVA_VERSION="$2"
            shift 2
            ;;
        --output)
            OUTPUT_DIR="$2"
            shift 2
            ;;
        --spec)
            SPEC_FILES="$2"
            shift 2
            ;;
        --package)
            PACKAGE_NAME="$2"
            shift 2
            ;;
        *)
            echo "Unknown option: $1"
            exit 1
            ;;
    esac
done

# Check if necessary directories and files exist
if [ ! -d "$SPEC_DIR" ]; then
    echo "Error: Spec directory '$SPEC_DIR' not found."
    exit 1
fi

if [ ! -f "java_openapi_versions.txt" ]; then
    echo "Error: java_openapi_versions.txt not found in the current directory."
    exit 1
fi

# Create output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Function to get all YAML files in the spec directory
get_all_spec_files() {
    find "$SPEC_DIR" -name "*.yml" -o -name "*.yaml" | sed "s|$SPEC_DIR/||" | tr '\n' ',' | sed 's/,$//'
}

# If no spec files are specified, use all available spec files
if [ -z "$SPEC_FILES" ]; then
    SPEC_FILES=$(get_all_spec_files)
else
    # Verify that the specified spec file exists
    if [ ! -f "$SPEC_DIR/$SPEC_FILES" ]; then
        echo "Error: Specified spec file '$SPEC_FILES' not found in '$SPEC_DIR'."
        exit 1
    fi
fi

if [ -z "$SPEC_FILES" ]; then
    echo "Error: No spec files found in '$SPEC_DIR'."
    exit 1
fi

# Function to get OpenAPI Generator version based on Java version
get_openapi_version() {
    local java_version=$1
    local openapi_version=""

    while IFS=',' read -r openapi_ver java_range || [[ -n "$openapi_ver" ]]; do
        if [[ "$openapi_ver" != \#* ]]; then  # Skip comments
            IFS='-' read -r min_java max_java <<< "$java_range"
            if (( $java_version >= $min_java && $java_version <= $max_java )); then
                openapi_version=$openapi_ver
            fi
        fi
    done < java_openapi_versions.txt

    if [ -z "$openapi_version" ]; then
        echo "Error: No compatible OpenAPI Generator version found for Java $java_version" >&2
        exit 1
    fi
    echo $openapi_version
}

# Get OpenAPI Generator version
OPENAPI_VERSION=$(get_openapi_version "$JAVA_VERSION")

# Check if gradle is available
if ! command -v gradle &> /dev/null; then
    echo "Error: gradle could not be found. Please ensure it's installed and in your PATH."
    exit 1
fi

# Update config files if a single spec file is provided
if [ -n "$SPEC_FILES" ] && [ $(echo "$SPEC_FILES" | tr ',' '\n' | wc -l) -eq 1 ]; then
    update_generator_config "$SPEC_FILES"
    update_spec_config "$SPEC_FILES"
    SPEC_FILES_LIST="'$SPEC_FILES'"
else
    # Format SPEC_FILES for Groovy list
    IFS=',' read -r -a specArray <<< "$SPEC_FILES"
    SPEC_FILES_LIST=$(printf "'%s'," "${specArray[@]}")
    SPEC_FILES_LIST=${SPEC_FILES_LIST%,}  # Remove trailing comma
fi

# Generate Gradle project
gradle -b meta-generator.gradle generateGradleProject \
    -PjavaVersion="$JAVA_VERSION" \
    -PopenApiGeneratorVersion="$OPENAPI_VERSION" \
    -PoutputDir="$OUTPUT_DIR" \
    -PbasePackage="$PACKAGE_NAME" \
    -Pspecs="[$SPEC_FILES_LIST]" \
    -PsingleSpec="$SPEC_FILES"

if [ $? -ne 0 ]; then
    echo "Error: Gradle project generation failed."
    exit 1
fi

# Navigate to output directory and generate OpenAPI
cd "$OUTPUT_DIR" || exit
gradle openApiGenerateFullProject

if [ $? -ne 0 ]; then
    echo "Error: OpenAPI generation failed."
    cd ..
    exit 1
fi

cd ..

echo "Project generation complete. Output directory: $OUTPUT_DIR"
echo "Generated spec files: $SPEC_FILES"
