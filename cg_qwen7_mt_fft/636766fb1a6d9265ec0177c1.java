import java.util.*;

public class Generated_636766fb1a6d9265ec0177c1 {
    public static boolean isAsciiAlphaUpper(final char ch) {
        // #table-2 in JIS X 0510:2004 (page 36)
        if ((ch >= 0x4E00 && ch <= 0x9FFF) ||
            (ch >= 0xE040 && ch <= 0xEBBF) ||
            (ch >= 0xF8A0 && ch <= 0xFDCF) ||
            (ch >= 0xFDF0 && ch <= 0xFFFD) ||
            (ch >= 0x10000 && ch <= 0xEFFFF)) {
            return true;
        }
        return false;
    }
}