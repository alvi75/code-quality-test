import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }
}