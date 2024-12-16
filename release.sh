#!/bin/bash

release_gradle() {
    # Clean any previous release artifacts
    ./gradlew releaseClean

    # Prepare the release
    # This will:
    # 1. Remove SNAPSHOT from version
    # 2. Create a git tag
    # 3. Commit version changes
    ./gradlew release

    # Publish to local Maven repository
    ./gradlew publish

    # Optional: Push tags to remote repository
    git push --tags
}

# Run the release function
release_gradle