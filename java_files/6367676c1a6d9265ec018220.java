import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    public static String stripFilenameExtension(String path) {
        int lastDot = path.lastIndexOf('.');
        if (lastDot > 0 && lastDot < path.length() - 1) {
            return path.substring(0, lastDot);
        }
        return path;
    }
}