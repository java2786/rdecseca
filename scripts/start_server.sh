#!/bin/bash
sudo chmod -R 777 /home/ec2-user
java -jar /home/ec2-user/my-app.jar > /dev/null 2> /dev/null < /dev/null &