import java.util.*;

public class Translation436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
    IntList map = new IntList((end - ptr) / 36);
    map.fillTo(0, Integer.MIN_VALUE);
    for (int i = 0;
    i < end - ptr;
    i++) {
        if (buf[ptr + i] == '\n') {
            map.add(i);
        }
    }
    map.add(end);
    return map;
}
}