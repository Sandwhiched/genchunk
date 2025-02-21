import java.io.File;
import chunk.sys.Errors;

public class Chunk {
    /*
     * Compiler entrypoint.
     * Return codes:
     *   0 - OK
     *   1 - No source file given/found
     *   2 - Insufficient permissions
     */
    public static void main(String[] args) {
        // Terminate execution if no source file given
        if (args.length == 0) {
            Errors.noSourceFileGiven();
        }

        final String path = args[0];

        File file = new File(path);

        if (!file.exists()) {
            Errors.sourceFileNotFound(path);
        }
    }
}