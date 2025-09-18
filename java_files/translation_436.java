import java.util.*;

public class Translation436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
    IntList map = new IntList((end - ptr) / 36);
    map.fillTo(1, Integer.MIN_VALUE);
    for (;
    ;
    ) {
        ptr = nextLF(buf, ptr);
        if (ptr >= end)break;
        map.add(ptr);
    }
    map.add(end);
    return map;
}
}