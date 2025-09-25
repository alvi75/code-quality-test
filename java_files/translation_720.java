import java.util.*;

public class Translation720 {
    public Cell merge(Cell m, Cell e) {
    if (m.cmd == e.cmd && m.ref == e.ref && m.skip == e.skip)return new Cell(m);
    elsereturn null;
}
}