import java.util.*;

public class Translation727 {
    123 public int getCells() {
    int size = 0;
    for (char c : cells.keySet()) {
        Cell e = at(c);
        if (e.cmd >= 0 || e.ref >= 0) {
            size++;
        }
    }
    return size;
}
}