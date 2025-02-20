# Script requirements:
# - GraalVM

if [[ "$1" == "-q" ]]; then
    javac chunk/util/*.java
    javac Chunk.java
    native-image Chunk -o ./chunk.x86_64 -Ob
elif [[ "$1" == "-c" ]]; then
    javac chunk/util/*.java
    javac Chunk.java
else
    javac chunk/util/*.java
    javac Chunk.java
    native-image Chunk -o ./chunk.x86_64
fi
