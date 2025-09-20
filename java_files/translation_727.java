import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (CharSequence c : cells.keySet()) {
        Cell e = at(c);
        if (e.getCmd() >= 0 || e.getRef() >= 0) {
            size++;
        }
    }
    return size;
}
}