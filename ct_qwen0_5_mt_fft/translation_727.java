import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (CharRange r : cells.values()) {
        Cell e = at(r.start);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}
}