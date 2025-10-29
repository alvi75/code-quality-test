import java.util.*;

public class Generated_636767ab1a6d9265ec018676 {
    public static boolean isHex(final char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else if (c >= 'a' && c <= 'f') {
            return true;
        } else if (c >= 'A' && c <= 'F') {
            return true;
        }
        return false;
    }
}