import java.util.*;

public class Translation931 {
    public static int match(byte[] b, int ptr, byte[] src) {
    if (ptr + src.length > b.length) {
        return -1;
    }
    for (int i = 0;
    i < src.length;
    i++, ptr++) {
        if (b[ptr] != src[i]) {
            return -1;
        }
    }
    return ptr;
}
}