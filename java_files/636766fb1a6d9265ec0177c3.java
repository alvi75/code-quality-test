import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch) {
        final int cp = (int) ch;
        return ((cp >= 0x20 && cp <= 0x7E) || (cp >= 0x09 && cp <= 0x0F)
                || (cp >= 0x11 && cp <= 0x1A));
    }
}