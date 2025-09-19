import java.util.*;

public class Translation263 {
    public boolean eat(Row in, int[] remap) {
    int sum = 0;
    for(Cell c : in.cells.values()) {
        sum += c.cnt;
        if (c.ref >= 0) {
            if (remap[c.ref] == 0) {
                c.ref = -1;
                int frame = sum/10;
                boolean live = false;
                for(Cell d : in.cells.values()) {
                    if (d.cnt < frame && d.cmd >= 0) {
                        d.cnt = 0;
                        d.cmd = -1;
                    }
                    if (d.cmd >= 0 || d.ref >= 0) {
                        live |= true;
                    }
                }
                return !live;
            }
}