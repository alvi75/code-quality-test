import java.util.*;

public class Generated_6367670b1a6d9265ec017a05 {
    public static String toString(final char ch) {
        switch (ch) {
            case '\n': return "\\n";
            case '\r': return "\\r";
            case '\\': return "\\\\";
            default:
                if ((ch >= 0x20 && ch <= 0xD7FF)
                    || ch == 0x9 || ch == 0xA || ch == 0xD) {
                    // The text of this string is entirely in the "info" range.
                    return new StringBuilder().append(ch).toString();
                } else {
                    final int len = 4;
                    final StringBuilder buf = new StringBuilder(len);
                    writeHex(buf, ch & 0xFFFF, len, true);
                    return buf.toString();
                }
        }
    }
}