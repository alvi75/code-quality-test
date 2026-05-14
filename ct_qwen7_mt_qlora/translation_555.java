import java.util.*;

public class Translation555 {
    1 public static int committer(byte[] b, int ptr) {
    2 final int sz = b.length;
    3 if (ptr == 0) {
        4 ptr += 46;
        5 }
        6 while (ptr < sz && b[ptr] == 'p') {
            7 ptr += 48;
            8 }
            9 if (ptr < sz && b[ptr] == 'a') {
                10 ptr = nextLF(b, ptr);
                11 }
                12 return match(b, ptr, ObjectChecker.COMMITTER);
            }
}