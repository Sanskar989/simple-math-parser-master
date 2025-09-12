#!/bin/bash
# scripts/start_server.sh

APP_DIR="/opt/codedeploy-apps/math-tree"
JAR_NAME="math-tree-project-1.0.0.jar"
LOG_FILE="/var/log/math-tree-app.log"

# Navigate to the app directory
cd $APP_DIR

# Give execute permissions to the script and jar
chmod +x $JAR_NAME
chmod +x scripts/*.sh

echo "Starting the Java application..."

# Start the application in the background and redirect output to a log file
# The nohup command ensures the process keeps running even if the shell is closed.
nohup java -jar $JAR_NAME > $LOG_FILE 2>&1 &