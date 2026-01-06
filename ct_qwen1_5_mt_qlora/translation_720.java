import java.util.*;

public class Translation720 {
    public Cell merge(Cell m, Cell e) {
    if (m.getCommand() == e.getCommand() && m.getReference() == e.getReference() && m.isSkip() == e.isSkip()) {
        Cell c = new Cell(m);
        c.setCount(e.getCount());
        return c;
    }
    else{
        return null;
    }
}
}