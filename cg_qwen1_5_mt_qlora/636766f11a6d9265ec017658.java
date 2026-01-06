import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    /**Return the index of the last directory separator character, under Unix or Windows.
@see #indexOfFirstSeparator
@param filename The file name to search in.
@return The index of the last directory separator character, or -1 if none is found.
*/
public static int indexOfLastSeparator(String filename) {
        int len = filename.length();
        if (len == 0)
            return -1;
        char ch = filename.charAt(len-1);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Assume it's a file name; look for a dot.
            return indexOf(filename, '.', 0, len);
        }
        // Must be a path.
        int r = indexOf(filename, '/');
        if (r < 0)
            return len - 1;
        else
            return r;
    }
}