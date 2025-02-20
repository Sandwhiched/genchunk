# Script requirements:
# - GraalVM

if [[ "$1" == "-q" ]]; then
    javac genchunk/util/*.java
    javac Genchunk.java
    native-image Genchunk -o ./genchunk.x86_64 -Ob
elif [[ "$1" == "-c" ]]; then
    javac genchunk/util/*.java
    javac Genchunk.java
else
    javac genchunk/util/*.java
    javac Genchunk.java
    native-image Genchunk -o ./genchunk.x86_64
fi
