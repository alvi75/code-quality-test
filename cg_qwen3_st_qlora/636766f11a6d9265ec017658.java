import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    /**
 * /**Return the index of the last directory separator character, under Unix or Windows.
 */
public static int indexOfLastSeparator(String filename) {
        if (filename == null) {
            return -1;
        }
        int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
        int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
        return (lastUnixPos > lastWindowsPos ? lastUnixPos : lastWindowsPos);
    }
}