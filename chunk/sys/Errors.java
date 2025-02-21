package chunk.sys;

public class Errors {
    public static void terminate(int exitCode, String message) {
        System.err.println("chunk: " + message);
        System.exit(exitCode);
    }

    public static void noSourceFileGiven() {
        terminate(1, "No source file given");
    }

    public static void sourceFileNotFound(String path) {
        terminate(1, "Source file \"" + path + "\" not found");
    }
}