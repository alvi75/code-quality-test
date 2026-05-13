import java.util.*;

public class Translation197 {
    ublic int getCellsVal() {
    int size = 0;
    for (Character c : cells.keySet()) {
        Cell e = at(c);
        if (e.cmd >= 0) {
            size++;
        }
    }
    return size;
}
}