import java.util.*;

public class Translation931 {
    public static final int match(final byte[] b, int ptr, final byte[] src) {
    if (ptr + src.length > b.length)return -1;
    for (int i = 0;
    i < src.length;
    i++, ptr++) {
        if (b[ptr] != src[i])return -1;
    }
    return ptr;
}
}