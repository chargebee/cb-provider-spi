#!/bin/bash

# Make this script executable
chmod +x "$0"

# Check if Gradle wrapper is available
if ! command -v ./gradlew &> /dev/null
then
    echo "Gradle wrapper not found. Please ensure you're in the correct directory."
    exit 1
fi

# Check if a JSON file is provided
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <path_to_json_file>"
    exit 1
fi

# Create a temporary directory to store the contents of the generated folder
TEMP_DIR=$(mktemp -d)

# If the generated folder exists, copy its contents to the temporary directory
if [ -d "generated" ]; then
    cp -R generated/* "$TEMP_DIR" 2>/dev/null
fi

# Delete the generated folder
rm -rf generated 2>/dev/null

# Automatically detect the schema file
SCHEMA_FILE=$(find . -name "*schema.json" | head -n 1)

if [ -z "$SCHEMA_FILE" ]; then
    echo "Error: Could not find a schema file in the current directory or its subdirectories."
    rm -rf "$TEMP_DIR"
    exit 1
fi

# Export the schema path as an environment variable
export JSON_SCHEMA_PATH="$SCHEMA_FILE"

echo "Using schema file: $JSON_SCHEMA_PATH"

# Clean and build the JSON Schema Validator
./gradlew clean buildJsonSchemaValidator

# Find the JAR file
JAR_FILE=$(find build/libs -name "json-schema-validator-1.0.jar" | head -n 1)

if [ -z "$JAR_FILE" ]; then
    echo "Error: Could not find the JSON Schema Validator JAR file. Build may have failed."
    rm -rf "$TEMP_DIR"
    exit 1
fi

# Run the Java application using the generated JAR file
java -jar "$JAR_FILE" "$1"

# Check the exit status
VALIDATION_STATUS=$?
if [ $VALIDATION_STATUS -eq 0 ]; then
    echo "Validation completed successfully."
else
    echo "Validation failed. Please check the output above for details."
fi

# Recreate the generated folder and restore its contents
mkdir -p generated
cp -R "$TEMP_DIR"/* generated 2>/dev/null

# Clean up the temporary directory
rm -rf "$TEMP_DIR"

exit $VALIDATION_STATUS