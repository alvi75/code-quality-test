import java.util.*;

public class Generated_636766851a6d9265ec01751b {
    public static char decodeHexNibble(final char c) {
        if (c >= '0' && c <= '9') {
            return (char) (c - '0');
        }
        if (c >= 'A' && c <= 'F') {
            return (char) (c - 'A' + 10);
        }
        if (c >= 'a' && c <= 'f') {
            return (char) (c - 'a' + 10);
        }
        return (char) -1;
    }
}