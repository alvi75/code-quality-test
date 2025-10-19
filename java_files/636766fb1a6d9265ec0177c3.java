import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    /**Return true if the given character is a ASCII seven bit character,otherwise return false.
@since 1.0
@see #isAscii(int)
@deprecated Use {@link Character#isAscii(char)} instead.
*/
@Deprecated
    public static boolean isAscii(final char ch) {
        return (ch & 0x7F) == ch;
    }
}