import java.util.*;

public class Translation263 {
    public boolean eat(Row in, int[] remap) {
    int sum = 0;
    for (Cell c : in.cells.values()) {
        sum += c.cnt;
        if (c.ref >= 0) {
            if (remap[c.ref] == 0) {
                c.ref = -1;
            }
        }
    }
    int frame = sum / 10;
    boolean live = false;
    for (Cell c : in.cells.values()) {
        if (c.cnt < frame && c.cmd >= 0) {
            c.cnt = 0;
            c.cmd = -1;
        }
    }
    return !live;
}
}