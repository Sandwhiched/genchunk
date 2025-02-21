package chunk.sys;

public class Errors {
    public enum FilePermission {
        READ,
        WRITE,
        EXECUTE
    }

    public static void terminate(int exitCode, String message) {
        System.err.println("chunk: " + message);
        System.exit(exitCode);
    }

    public static void noSourceFileGiven() {
        System.err.println("Usage: chunk [source file]");
        System.exit(1);
    }

    public static void sourceFileNotFound(String path) {
        terminate(1, "Source file \"" + path + "\" not found");
    }

    public static void insufficientPermissions(FilePermission permission, String file) {
        terminate(2, "Insufficient " + permission.toString().toLowerCase() + " permissions on " + file);
    }

    public static void syntaxError(int line, String error, String offendingLine) {
        System.err.println("chunk: Syntax error, line " + line + ": " + error);
        System.err.println(line + " | " + offendingLine);
        System.exit(3);
    }
}