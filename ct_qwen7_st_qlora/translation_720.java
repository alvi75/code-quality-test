import java.util.*;

public class Translation720 {
    public Cell merge(Cell m, Cell e) {
    if (m.cmd == e.cmd && m.ref_1 == e.ref_1 && m.skip == e.skip) {
        Cell c = new Cell(m);
        c.cnt += e.cnt;
        return c;
    }
    else {
        return null;
    }
}
}