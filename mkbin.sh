#!/bin/bash

# Script requirements:
# - GraalVM

if [[ "$1" == "-c" ]]; then
    javac chunk/*/*.java
    javac Chunk.java
else
    javac chunk/*/*.java
    javac Chunk.java
    native-image Chunk -o ./chunk.x86_64
fi
