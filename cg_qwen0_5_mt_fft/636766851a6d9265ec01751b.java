import java.util.*;

public class Generated_636766851a6d9265ec01751b {
    private static char decodeHexNibble(final char c) {
        if (c >= '0' && c <= '9') {
            return (char) ('0' - 0x30 + c - 48);
        } else if (c >= 'A' && c <= 'F') {
            return (char) ('0' - 0x5b + c - 72);
        } else if (c >= 'a' && c <= 'f') {
            return (char) ('0' - 0x5a + c - 106);
        } else {
            throw new IllegalArgumentException("Invalid hex nibble: " + c);
        }
    }
}