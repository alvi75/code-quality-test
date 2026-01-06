import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
        if (filename == null || filename.length() < 1) {
            return -1;
        }
        for (int i = filename.lastIndexOf(File.separatorChar); i >= 0; i--) {
            if (i > 0 && !Character.isWhitespace(filename.charAt(i - 1))) {
                return i;
            }
        }
        return -1;
    }
}