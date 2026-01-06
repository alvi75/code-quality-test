import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    /**Return true if the given character is a ASCII seven bit character,otherwise return false.*/
    public static boolean isAscii(final char ch) {
        final int i = (int)ch;
        return ((i >= 0x20 && i <= 0x7e) || (i == 0x9 || i == 0xa || i == 0xd));
    }
}