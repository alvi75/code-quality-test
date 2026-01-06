import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (Character c : cells.keySet()) {
        Cell e = at(c);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}
}