import java.util.*;

public class Translation678 {
    ublic static int prev(byte[] b, int ptr, char chrA) {
    if (ptr == b.length) {
        --ptr;
    }
    while (ptr >= 0) {
        if (b[ptr--] == chrA) {
            return ptr;
        }
    }
    return ptr;
}
}