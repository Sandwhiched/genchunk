import chunk.util.Errors;
import chunk.util.Errors.PermissionType;
import java.io.File;

public class Chunk {
    /* Program entrypoint.
     * Return codes:
     *   0 - OK
     *   1 - No source file given
     *   2 - Source file not found
     *   3 - Insufficient permissions
     *   255 - Unknown fatal error
     */
    public static void main(String[] args) {
        // Error out if no source file given
        if (args.length == 0) {
            Errors.noSourceFileGiven();
        }

        // "Alias" args[0] to a variable
        final String path = args[0];

        // Create a File object from the path given
        File sourceFile = new File(path);
        
        // Verify the file exists, and error out if not
        if (!sourceFile.exists()) {
            Errors.fileNotFound(path);
        }

        // Check if permitted to read, else error out
        if (!sourceFile.canRead()) {
            Errors.insufficientPermissions(PermissionType.READ, path);
        }
    }
}