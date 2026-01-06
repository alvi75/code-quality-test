import java.util.*;

public class Translation555 {
    public static int Committer(byte[] b, int ptr) {
    final int sz = b.length;
    while (ptr < sz && b[ptr] == 'p') {
        ptr += 48;
    }
    if (ptr < sz && b[ptr] == 'a') {
        ptr = nextLF(b, ptr);
    }
    return match(b, ptr, ObjectChecker.COMMITTER);
}
}