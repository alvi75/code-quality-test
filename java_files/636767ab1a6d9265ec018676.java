import java.util.*;

public class Generated_636767ab1a6d9265ec018676 {
    /**
     * Return true if the given character is a hex digit,otherwise return false.
     */
    private static boolean isHex(final char c) {
        final int i = (int) c;
        return ((i >= 0x30 && i <= 0x39) || // 0-9
                (i >= 0x41 && i <= 0x46) || // A-F
                (i >= 0x61 && i <= 0x66)); // a-f
    }
}