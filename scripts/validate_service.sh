#!/bin/bash
# scripts/validate_service.sh

JAR_NAME="math-tree-project-1.0.0.jar"

# Give the server a few seconds to start up
sleep 10 

echo "Validating if the service is running..."

# Check if the Java process is running
if pgrep -f $JAR_NAME > /dev/null; then
  echo "Validation successful: Application is running."
  exit 0
else
  echo "Validation failed: Application is NOT running."
  # Exit with a non-zero status code to indicate failure
  exit 1
fi