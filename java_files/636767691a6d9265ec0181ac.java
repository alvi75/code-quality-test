import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    /**Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.
@throws IllegalArgumentException if the path is null or empty,or the relative path is null or empty.
@return the full file path constructed from the given path and relative path.
@since 1.0.2
*/ public static String applyRelativePath(String path,String relativePath) {
        if (path == null || "".equals(path)) throw new IllegalArgumentException("The path must not be null or empty.");
        if (relativePath == null || "".equals(relativePath)) throw new IllegalArgumentException("The relative path must not be null or empty.");

        int lastSeparatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (lastSeparatorIndex < 0)
            return path + FOLDER_SEPARATOR + relativePath;
        else
            return path.substring(0,lastSeparatorIndex+1) + relativePath;
    }
}