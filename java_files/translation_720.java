import java.util.*;

public class Translationtranslation_720 {
    public Cell merge(Cell m, Cell e) {
        if (m.cmd == e.cmd && m.ref == e.ref && m.skip == e.skip) {
            Cell c = new Cell(m);
            c.cnt += e.cnt;
            return c;
        }
        else {
            return null;
        }
    }
}