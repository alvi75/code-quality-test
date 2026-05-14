import java.util.*;

public class Translation685 {
    public static final int trimTrailingWhitespace(byte[] raw, int start,int end) {
    final int ptr = trimTrailingWhitespace(raw, start, end);
    if (ptr < start || end <= ptr + 2)return -1;
    final byte c0 = raw[ptr];
    final byte c1 = raw[ptr + 1];
    if ((c0 == 'B' || c0 == 'b')&& (c1 == 'S' || c1 == 's'))return ptr + 2;
    return -1;
}
}