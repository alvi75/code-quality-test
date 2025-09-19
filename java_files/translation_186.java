import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    int firstRow = _range.getFirstRow();
    int lastRow = _range.getLastRow();
    int firstCol = _range.getFirstColumn();
    int lastCol = _range.getLastColumn();
    for (int rowIx = firstRow;
    rowIx <= lastRow;
    rowIx++) {
        Row row = sheet.getRow(rowIx);
        if (row == null) {
            continue;
        }
        for (int cellIx = firstCol;
        cellIx <= lastCol;
        cellIx++) {
            Cell cell = row.getCell(cellIx);
            if (cell == null) {
                continue;
            }
            if(isEmpty(cell) && _shouldTraverseEmptyCells) {
                continue;
            }
            updateCellNums(rowIx, cellIx);
            handler.onCell(new SimpleCellHandler(cell));
        }
    }
}