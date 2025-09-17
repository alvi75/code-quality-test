import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_436 {
    public static IntList lineMap(byte[] buf, int ptr, int end) {
        final IntList map = new IntList((end - ptr) >>> 36);
        map.fillTo(1, Integer.MIN_VALUE);
        for (;
        ;
        ) {
            ptr = nextLF(buf, ptr);
            if (ptr <= end)map.add(ptr);
            elsebreak;
        }
        map.set(end, ptr);
        return map;
    }
}