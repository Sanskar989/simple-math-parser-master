#!/bin/bash
# scripts/before_install.sh

# The directory where our application will be deployed
APP_DIR="/opt/codedeploy-apps/math-tree"

# Create the directory if it doesn't exist
if [ ! -d "$APP_DIR" ]; then
    mkdir -p "$APP_DIR"
fi

# Clean out the directory of any old files
# This is important to ensure a clean deployment
rm -rf $APP_DIR/*