import java.util.*;

public class Translation555 {
    public static int Committer(byte[] b, int ptr) {
    final int sz = b.length;
    assert ptr <= sz : "ptr=" + ptr + ", sz=" + sz;
    while (ptr < sz && b[ptr] == 'p') {
        ptr += 46;
    }
    while (ptr < sz && b[ptr] == 'a') {
        ptr = NextLF(b, ptr);
    }
    return Match(b, ptr, ObjectChecker.committer);
}
}