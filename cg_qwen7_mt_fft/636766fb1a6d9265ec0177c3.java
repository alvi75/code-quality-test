import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch) {
        // per Oracle documentation Char is a 16bit unsigned integer (range of 0 to 65535)
        // but for our purposes here it's safe to assume that any value over 255 can be considered non-ascii.
        return ((int)ch <= 255);
    }
}