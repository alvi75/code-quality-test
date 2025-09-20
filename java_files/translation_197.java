import java.util.*;

public class Translation197 {
    public int getCellsVal() {
    int size = 0;
    for (Map.Entry<Character, Cell> entry : cells.entrySet()) {
        Cell e = entry.getValue();
        if (e.getCmd() >= 0) {
            size++;
        }
    }
    return size;
}
}