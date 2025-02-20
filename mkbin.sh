# Script requirements:
# - GraalVM
javac chunk/util/Errors.java
javac Chunk.java
native-image Chunk -o ./genchunk