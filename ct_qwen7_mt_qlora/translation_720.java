import java.util.*;

public class Translation720 {
    1 public Cell merge(Cell m, Cell e) {
    2 if (m.cmd == e.cmd && m.ref_ == e.ref_ && m.skip == e.skip) {
        3 Cell c = new Cell(m);
        4 c.cnt += e.cnt;
        5 return c;
        6 }
        else {
            7 return null;
            8 }
        }
}