import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        final int len = filename.length();
        int i = len - 1;
        for (; i >= 0; --i) {
            if (OS_PATH_SEPARATOR.equals(filename.substring(i, i + 1))) {
                return i;
            }
        }
        return -1;
    }
}