import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (int i = 0;
    i < cells.size();
    i++) {
        Cell e = cells.get(i);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}
}