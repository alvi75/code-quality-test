import java.util.*;

public class Translation436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
    IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, Integer.MIN_VALUE);
    for (int i = 0;
    i < end;
    i++) {
        if (buf[ptr++] == '\n') {
            map.add(i);
        }
        else if (buf[ptr++] == '\r') {
            map.add(++i);
        }
        else {
            break;
        }
    }
    map.add(end);
    return map;
}
}