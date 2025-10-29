import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    /**Return the path without the extension.**/
public static String stripFilenameExtension(String path) {
        int lastDot = path.lastIndexOf('.');
        if (lastDot == -1) return path;
        else return path.substring(0, lastDot);
    }
}