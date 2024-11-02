#!/bin/bash
javac -encoding utf8 -d ./bin -classpath ./res -sourcepath ./src ./src/core/Launcher.java
if [ $? -eq 0 ]; then
    java -classpath ./bin:./res core.Launcher
fi
