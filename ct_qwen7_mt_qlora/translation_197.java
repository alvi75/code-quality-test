import java.util.*;

public class Translation197 {
    1 public int getCellsVal() {
    2 int size = 0;
    3 for (Character c : cells.keySet()) {
        4 Cell e = at(c);
        5 if (e.cmd >= 0) {
            6 size++;
            7 }
            8 }
            9 return size;
        }
}