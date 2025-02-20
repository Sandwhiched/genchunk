public class Errors {
    // Exit the program with a non-zero exit code and message.
    public static void errorOut(int exitCode, String message) {
        System.err.println("chunk: " + message);
        System.exit(exitCode);
    }
}