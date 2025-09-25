import java.util.*;

public class Translation436 {
    public static List<Integer> lineMap(final byte[] buf, final int ptr, final int end) {
    final List<Integer> map = new ArrayList<>();
    map.add(0);
    int p = ptr;
    while (p < end) {
        p += nextLF(buf, p);
        map.add(p);
    }
    map.add(end);
    return map;
}
}