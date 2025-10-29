import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    /**Return the index of the last directory separator character, under Unix or Windows.**/
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        for (int i = filename.lastIndexOf(File.separatorChar); i >= 0; i--) {
            if (i > 0 && filename.charAt(i-1) == File.separatorChar)
                return i;
        }
        return -1;
    }
}