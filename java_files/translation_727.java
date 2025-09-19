import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (char c : cells.keySet().toArray(new Character[0])) {
        Cell e = at(c);
        if (e.ref >= 0 || e.cmd >= 0) {
            size++;
        }
    }
    return size;
}
}