import java.util.*;

public class Generated_636767821a6d9265ec0183a0 {
    protected static void deleteFile(String fileName) {
        File f = new File(fileName);
        if (f.exists()) {
            try {
                f.delete();
            } catch (SecurityException se) {
                //ignore, we tried our best.
            }
        }
    }
}