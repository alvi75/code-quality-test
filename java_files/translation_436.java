import java.util.*;

public class Translation436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
    final IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, -1);
    for (;
    ptr < end;
    ptr = nextLF(buf, ptr)) {
        map.add(ptr);
    }
    map.add(end);
    return map;
}
}