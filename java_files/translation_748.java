import java.util.*;

public class Translation748 {
    public boolean hasNext() {
    return pos < maxColumn;
}
Create a new class called "CellRangeAddress" with the following properties: - firstRow - lastRow - firstCol - lastCol - isSingleCell - createCellReference(String reference){
    if (reference == null){
        return null;
    }
    int sep = reference.IndexOf(":", StringComparison.Ordinal);
    CellReference first;
    CellReference last;
    if (sep == -1){
        first = new CellReference(reference);
        last = first;
    }
    else{
        first = new CellReference(reference.Substring(0, sep));
        last = new CellReference(reference.Substring(sep + 1));
    }
    return new CellRangeAddress(first.Row, last.Row, first.Col, last.Col, isSingleCell);
}
}