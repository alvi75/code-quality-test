import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    int firstRow = range.getFirstRow();
    int lastRow = range.getLastRow();
    int firstCol = range.getFirstColumn();
    int lastCol = range.getLastColumn();
    for (int row = firstRow;
    row <= lastRow;
    row++) {
        for (int col = firstCol;
        col <= lastCol;
        col++) {
            if (isEmpty(getRow(row), getColumn(col)) {
                continue;
            }
            handler.onCell(getRow(row), getColumn(col));
        }
    }
}
}