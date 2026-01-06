import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    public static String stripFilenameExtension(String path) {
        int i = path.lastIndexOf('.');
        if (i > 0) {
            return path.substring(0, i);
        }
        return path;
    }
}