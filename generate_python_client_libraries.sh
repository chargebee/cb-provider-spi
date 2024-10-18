#!/bin/sh

# Function to check if a command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Check if openapi-generator-cli is installed
if ! command_exists openapi-generator-cli; then
    echo "openapi-generator-cli is not installed. Installing it now..."
    if command_exists brew; then
        brew install openapi-generator
    elif command_exists npm; then
        npm install @openapitools/openapi-generator-cli -g
    else
        echo "Error: Neither Homebrew nor npm is available. Please install openapi-generator-cli manually."
        exit 1
    fi
fi

# Check if a spec file path is provided
if [ $# -eq 0 ]; then
    echo "Please provide the path to the OpenAPI spec file as an argument."
    exit 1
fi

# Get the absolute path of the spec file
SPEC_FILE=$(realpath "$1")

# Check if the spec file exists
if [ ! -f "$SPEC_FILE" ]; then
    echo "The specified file does not exist: $SPEC_FILE"
    exit 1
fi

# Set the output directory (one level up from the current directory)
CURRENT_DIR=$(dirname "$(realpath "$0")")
PARENT_DIR=$(dirname "$CURRENT_DIR")
OUTPUT_DIR="${PARENT_DIR}/python_client_libraries"

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Generate the client libraries using OpenAPI Generator
openapi-generator-cli generate \
  -i "$SPEC_FILE" \
  -g python \
  -o "$OUTPUT_DIR"

echo "Client libraries have been generated in: $OUTPUT_DIR"