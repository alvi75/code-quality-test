import java.util.*;

public class Translation436 {
    public static final IntList lineMap(byte[] buf, int ptr, int end) {
    final IntList map = new IntList((end-ptr)/36+2);
    map.fillTo(1, Integer.MIN_VALUE);
    for (;
    ;
    ) {
        ptr = nextLF(buf, ptr);
        if (ptr == -1)break;
        map.add(ptr);
    }
    map.add(end);
    return map;
}
}