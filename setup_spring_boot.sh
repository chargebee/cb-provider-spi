#!/bin/bash

# Function to log messages
log() {
    echo "$(date '+%Y-%m-%d %H:%M:%S') - $1"
}

# Function to run a command and log its output
run_command() {
    log "Running command: $1"
    eval $1
    if [ $? -ne 0 ]; then
        log "Error: Command failed"
        exit 1
    fi
    log "Command completed successfully"
}

# Step 1: Generate Gradle project
log "Step 1: Generating Gradle project"
run_command "gradle -b meta-generator.gradle generateGradleProject"

# Step 2: Generate OpenAPI code
log "Step 2: Generating OpenAPI code"
run_command "cd ../adapter && gradle openApiGenerateFullProject"

# Step 3: Run Spring Boot application
log "Step 3: Running Spring Boot application"
run_command "cd ../adapter && gradle bootRun"

log "Script completed successfully"