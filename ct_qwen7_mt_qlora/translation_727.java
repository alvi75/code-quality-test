import java.util.*;

public class Translation727 {
    1 public int getCells() {
    2 int size = 0;
    3 for (char c : cells.keySet()) {
        4 Cell e = at(c);
        5 if (e.cmd >= 0 || e.ref_ >= 0) {
            6 size++;
            7 }
            8 }
            9 return size;
        }
}