import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        int lastSeparator = filename.lastIndexOf(File.separatorChar);
        if (lastSeparator < 0)
            return -1;
        return lastSeparator + 1;
    }
}