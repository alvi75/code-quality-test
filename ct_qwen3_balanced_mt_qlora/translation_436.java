import java.util.*;

public class Translation436 {
    ublic static IntList lineMap(byte[] buf, int ptr, int end) {
    final IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, Integer.MIN_VALUE);
    for (;
    ptr < end;
    ptr = nextLF(buf, ptr)) {
        map.add(ptr);
    }
    map.add(end);
    return map;
}
}