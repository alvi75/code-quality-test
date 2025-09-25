import java.util.*;

public class Translation678 {
    public static int prev(final byte[] b, final int ptr, final char chrA) {
    if (ptr == b.length) {
        --ptr;
    }
    while (ptr >= 0) {
        if (b[ptr--] == chrA) {
            return ptr;
        }
    }
    return ptr;
}
}