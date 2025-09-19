import java.util.*;

public class Translation678 {
    public static final int prev(byte[] b, int ptr, char chrA) {
    if (ptr == b.length)--ptr;
    while (ptr >= 0) {
        final byte c = b[ptr--];
        if (c == chrA || c == chrA.toUpperCase(Locale.US))return ptr;
    }
    return ptr;
}
}