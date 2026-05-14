import java.util.*;

public class Translation931 {
    public static final int match(byte[] b, int ptr, String src) {
    final byte s[] = Constants.encode(src);
    if (ptr + s.length > b.length)return -1;
    for (int i = 0;
    i < s.length;
    i++, ptr++)if (b[ptr] != s[i])return -1;
    return ptr;
}
}