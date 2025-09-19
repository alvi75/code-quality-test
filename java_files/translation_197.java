import java.util.*;

public class Translation197 {
    public int getCellsVal() {
    int size = 0;
    for (char c : cells.keySet().toArray(new Character[0])) {
        Cell e = at(c);
        if (e.cmd >= 0) {
            size++;
        }
    }
    return size;
}
}