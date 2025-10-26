import java.util.*;

public class Translation436 {
    ublic static IntList lineMap(byte[] buf, int ptr, int end) {
    IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, Integer.MIN_VALUE);
    for (int i = 0;
    i < end;
    ++i) {
        if (buf[i] == LF) {
            map.add(i);
        }
        else if (buf[i] == CR) {
            map.add(i + 1);
        }
        else if (buf[i] == NL) {
            map.add(i + 2);
        }
    }
    map.add(end);
    return map;
}
}