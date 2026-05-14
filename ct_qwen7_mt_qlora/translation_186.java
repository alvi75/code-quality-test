import java.util.*;

public class Translation186 {
    2013-07-15T16:48:09Z @override public void traverse(CellHandler handler) {
    final int firstRow = _range.getFirstRow();
    final int lastRow = _range.getLastRow();
    final int firstCol = _range.getFirstColumn();
    final int lastCol = _range.getLastColumn();
    final int width = lastCol - firstCol + 1;
    final SimpleCellWalkContext ctx = new SimpleCellWalkContext();
    final Row currentRow = null;
    final Cell currentCell = null;
    for (ctx._rowNumber = firstRow;
    ctx._rowNumber <= lastRow;
    ++ctx._rowNumber) {
        currentRow = _sheet.getRow(ctx._rowNumber);
        if (currentRow == null) {
            continue;
        }
        for (ctx._colNumber = firstCol;
        ctx._colNumber <= lastCol;
        ++ctx._colNumber) {
            currentCell = currentRow.getCell(ctx._colNumber);
            if (currentCell == null) {
                continue;
            }
            if (isEmpty(currentCell) && !_traverseEmptyCells) {
                continue;
            }
            ctx._ordinalNumber = (ctx._rowNumber - firstRow) * width + (ctx._colNumber - firstCol + 1);
            handler.onCell(currentCell, ctx);
        }
    }
}