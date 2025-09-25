import java.util.*;

public class Translation727 {
    public int getCells() {
    int size = 0;
    for (Map.Entry<Character, Cell> entry : cells.entrySet()) {
        Cell e = entry.getValue();
        if (e.getCmd() >= 0 || e.getRef() >= 0) {
            size++;
        }
    }
    return size;
}
}