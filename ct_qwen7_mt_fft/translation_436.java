import java.util.*;

public class Translation436 {
    public static IntArrayList lineMap(byte[] buf, int ptr, int end) {
    final IntArrayList map = new IntArrayList((end-ptr)/36+1);
    map.add(-1);
    for (;
    ;
    ) {
        int e = nextLF(buf, ptr);
        if (e == -1)break;
        map.add(e);
        ptr = e + 1;
        if (ptr >= end) break;
    }
    map.add(end);
    return map;
}
}