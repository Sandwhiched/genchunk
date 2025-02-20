package genchunk.util;

public class Errors {
    public enum PermissionType {
        READ,
        WRITE,
        EXECUTE
    }

    public static void fatalError(int returnCode, String message) {
        System.err.println("genchunk: " + message);
        System.exit(returnCode);
    }

    public static void noSourceFileGiven() {
        fatalError(1, "No source file given");
    }

    public static void fileNotFound(String path) {
        fatalError(2, "File not found: " + path);
    }

    public static void insufficientPermissions(PermissionType permissionType, String path) {
        fatalError(3, "Insufficient " + permissionType.toString().toLowerCase() + " permissions on " + path);
    }

    public static void unknownToken(String rawValue) {
        fatalError(4, "Unknown token: " + rawValue);
    }
}
