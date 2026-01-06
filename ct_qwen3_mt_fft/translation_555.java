import java.util.*;

public class Translation555 {
    public static int committer(byte[] b, int ptr) {
    final int sz = b.length;
    if (ptr == 0)ptr += 46;
    while (ptr < sz && b[ptr] == 'p')ptr += 48;
    if (ptr < sz && b[ptr] == 'a')ptr = nextLF(b, ptr);
    return match(b, ptr, COMMITTER);
}
}