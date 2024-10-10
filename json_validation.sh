#!/bin/bash

# Make the script executable if it's not already
if [ ! -x "$0" ]; then
    chmod +x "$0"
    exec "$0" "$@"
fi

# Check if the correct number of arguments is provided
if [ "$#" -ne 3 ]; then
    echo "Usage: $0 <java_file> <schema_path> <json_path>"
    exit 1
fi

# Assign arguments to variables
JAVA_FILE="$1"
SCHEMA_PATH="$2"
JSON_PATH="$3"

# Check if Java is installed
if ! command -v java &> /dev/null; then
    echo "Error: Java is not installed or not in the system PATH."
    exit 1
fi

# Check if the Java file exists
if [ ! -f "$JAVA_FILE" ]; then
    echo "Error: Java file '$JAVA_FILE' does not exist."
    exit 1
fi

# Check if the schema file exists
if [ ! -f "$SCHEMA_PATH" ]; then
    echo "Error: Schema file '$SCHEMA_PATH' does not exist."
    exit 1
fi

# Check if the JSON file exists
if [ ! -f "$JSON_PATH" ]; then
    echo "Error: JSON file '$JSON_PATH' does not exist."
    exit 1
fi

# Compile the Java file
echo "Compiling Java file..."
javac "$JAVA_FILE"

if [ $? -ne 0 ]; then
    echo "Error: Compilation failed."
    exit 1
fi

# Extract the class name from the Java file name
CLASS_NAME=$(basename "$JAVA_FILE" .java)

# Run the Java program
echo "Running JSON validation..."
java -cp .:$(dirname "$JAVA_FILE") "$CLASS_NAME" "$SCHEMA_PATH" "$JSON_PATH"

# Clean up the compiled class file
rm -f "$(dirname "$JAVA_FILE")/$CLASS_NAME.class"