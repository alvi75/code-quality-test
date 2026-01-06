import java.util.*;

public class Translation685 {
    public static int trimTrailingWhitespace(byte[] raw, int start, int end) {
    final int len = end - start;
    while (start < len && isWhitespace(raw[start])){
        start++;
    }
    return start;
}
}