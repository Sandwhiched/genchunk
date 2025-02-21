import java.io.File;
import chunk.sys.Errors;

public class Chunk {
    /*
     * Compiler entrypoint.
     * Return codes:
     *   0 - OK
     *   1 - No source file given/found
     *   2 - Insufficient permissions
     *   3 - Syntax error
     */
    public static void main(String[] args) {
        // Terminate execution if no source file given
        if (args.length == 0) {
            Errors.noSourceFileGiven();
        }

        // Put args[0] into a constant for simplicity
        final String path = args[0];

        // Create a File object for path
        File file = new File(path);

        // Terminate execution if file doesn't exist or has insufficient read permissions 
        if (!file.exists()) {
            Errors.sourceFileNotFound(path);
        } else if (!file.canRead()) {
            Errors.insufficientPermissions(Errors.FilePermission.READ, path);
        }
    }
}