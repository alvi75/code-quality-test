import java.util.*;

public class Translation678 {
    public static final int prev(final byte[] b, int ptr, char chr) {
    if (ptr == b.length) {
        --ptr;
    }
    while (ptr >= 0) {
        if (b[ptr--] == chr) {
            return ptr;
        }
    }
    return ptr;
}
}