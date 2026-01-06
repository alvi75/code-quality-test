import java.util.*;

public class Translation685 {
    public static int trimTrailingWhitespace(final byte[] raw, final int start, final int end) {
    final int ptr = end - 1;
    for (;
    start <= ptr && isWhitespace(raw[ptr]);
    ptr --);
    return ptr + 1;
}
}