#!/bin/bash
# Check if the application is running
if pgrep -f my-app.jar; then
  exit 0
else
  exit 1
fi