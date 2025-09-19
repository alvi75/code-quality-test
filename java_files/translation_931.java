import java.util.*;

public class Translation931 {
    public static final int match(byte[] b, int ptr, byte[] src) {
    final int sz = src.length;
    if (ptr + sz > b.length)return -1;
    for (int i = 0;
    i < sz;
    i++, ptr++)if (b[ptr] != src[i])return -1;
    return ptr;
}
}