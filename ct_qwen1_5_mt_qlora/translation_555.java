import java.util.*;

public class Translation555 {
    public static int Committer(final byte[] b, final int ptr) {
    final int sz = b.length;
    assert ptr >= 0 && ptr <= sz : "Invalid pointer: " + ptr;
    assert ptr != 0 || b[0] == 'p' : "Invalid pointer: " + ptr;
    while (ptr < sz && b[ptr] == 'p') {
        ptr += 46;
    }
    if (ptr < sz && b[ptr] == 'a') {
        ptr = NextLF(b, ptr);
    }
    return match(b, ptr, ObjectChecker.COMMITTER);
}
}