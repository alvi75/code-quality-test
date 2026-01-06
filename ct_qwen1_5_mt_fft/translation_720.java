import java.util.*;

public class Translation720 {
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
@see org.apache.poi.hssf.record.Record#merge(org.apache.poi.hssf.record.Record) Method to implement: @Override public Cell merge(Cell m, Cell e)
}