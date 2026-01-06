import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    /**Return the path without the extension.*/
    public static String stripFilenameExtension(String path) {
        int dot = path.lastIndexOf('.');
        if (dot == -1)
            return path;
        else
            return path.substring(0, dot);
    }
}