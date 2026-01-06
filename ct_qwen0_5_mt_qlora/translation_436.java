import java.util.*;

public class Translation436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
    IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, Integer.MIN_VALUE);
    for (int i = 0;
    i < map.size();
    i++) {
        map.set(i, nextLF(buf, ptr + i * 36));
    }
    map.add(end);
    return map;
}
}