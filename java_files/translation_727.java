import java.util.*;

public class Translation727 {
    public final int getCells() {
    Iterator<Character> i = cells.keySet().iterator();
    int size = 0;
    for (;
    i.hasNext();
    ) {
        Character c = i.next();
        Cell e = at(c);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}
}