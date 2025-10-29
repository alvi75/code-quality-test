import java.util.*;

public class Translation197 {
    123 public int getCellsVal() {
    int size = 0;
    for (Map.Entry<Character, Cell> entry : cells.entrySet()) {
        Cell e = entry.getValue();
        if (e.cmd >= 0) {
            size++;
        }
    }
    return size;
}
}