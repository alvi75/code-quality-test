import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        final String fs = File.separator;
        final int len = filename.length();
        for (int i = len - 1; i >= 0; --i) {
            if (fs.indexOf(filename.charAt(i)) != -1)
                return i;
        }
        return -1;
    }
}