#!/bin/bash

# Make this script executable
chmod +x "$0"

# Check if Gradle is installed
if ! command -v gradle &> /dev/null
then
    echo "Gradle is not installed. Please install Gradle and try again."
    exit 1
fi

# Clean and build the project
gradle clean build

# Find the JAR file
JAR_FILE=$(find build/libs -name "json-schema-validator*.jar" | head -n 1)

if [ -z "$JAR_FILE" ]; then
    echo "Error: Could not find the JAR file. Build may have failed."
    exit 1
fi

# Run the Java application using the generated JAR file
java -jar "$JAR_FILE" "$1" "$2"

# Check the exit status
if [ $? -eq 0 ]; then
    echo "Validation completed successfully."
else
    echo "Validation failed. Please check the output above for details."
fi