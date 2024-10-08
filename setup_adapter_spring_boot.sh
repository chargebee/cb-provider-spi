#!/bin/bash

# Default values
JAVA_VERSION="11"
OUTPUT_DIR="../adapter"
BASE_PACKAGE="com.adapter"

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

# Parse command-line arguments
while [[ $# -gt 0 ]]; do
    case $1 in
        --java-version)
            JAVA_VERSION="$2"
            shift 2
            ;;
        --output-dir)
            OUTPUT_DIR="$2"
            shift 2
            ;;
        --base-package)
            BASE_PACKAGE="$2"
            shift 2
            ;;
        *)
            echo "Unknown option: $1"
            exit 1
            ;;
    esac
done

# Get OpenAPI Generator version based on Java version
OPENAPI_VERSION=$(get_openapi_version $JAVA_VERSION)

echo "Using Java version: $JAVA_VERSION"
echo "Using OpenAPI Generator version: $OPENAPI_VERSION"

# Run the Gradle command to generate the project
gradle -b meta-generator.gradle generateGradleProject \
    -PjavaVersion="$JAVA_VERSION" \
    -PopenApiGeneratorVersion="$OPENAPI_VERSION" \
    -PoutputDir="$OUTPUT_DIR" \
    -PbasePackage="$BASE_PACKAGE"

# Navigate to the output directory and run openApiGenerate
cd "$OUTPUT_DIR"
gradle openApiGenerateFullProject

echo "Project generation and OpenAPI code generation completed successfully!"