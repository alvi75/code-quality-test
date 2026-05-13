import java.util.*;

public class Translation263 {
    public boolean eat(Row in, int[] remap) {
    final int[] cellRemaps = new int[in.cells.size()];
    for(int i=0;
    i<cellRemaps.length;
    i++) {
        cellRemaps[i] = -1;
    }
    int sum = 0;
    for(Cell c : in.cells.values()) {
        sum += c.cnt;
        if (c.ref >= 0) {
            if (remap[c.ref] == 0) {
                c.ref = -1;
            }
        }
    }
    int frame = sum/in.cells.size();
    boolean live = false;
    for(Cell c : in.cells.values()) {
        if (c.cnt < frame && c.cmd >= 0) {
            c.cnt = 0;
            c.cmd = -1;
        }
        if (c.cmd >= 0 || c.ref >= 0) {
            live = true;
        }
    }
    return !live;
}
}