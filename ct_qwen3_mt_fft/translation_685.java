import java.util.*;

public class Translation685 {
    public static int trimTrailingWhitespace(byte[] raw, int start, int end) {
    for (int ptr = end - 1;
    start <= ptr && isWhitespace(raw[ptr]);
    ptr--);
    return ptr + 1;
}
}