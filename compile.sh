#!/bin/bash

/opt/jdk-11.0.2/bin/javac -d target --module-source-path simple-modules/ $(find simple-modules -name "*.java")
