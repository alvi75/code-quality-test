import java.util.*;

public class Translation685 {
    public static final int trimTrailingWhitespace(final byte[] raw, final int start, final int end) {
    int ptr = end - 1;
    while (start <= ptr && isWhitespace(raw[ptr])) {
        ptr--;
    }
    return ptr + 1;
}
}