import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    int firstRow = range.getFirstRow();
    int lastRow = range.getLastRow();
    int firstCol = range.getFirstColumn();
    int lastCol = range.getLastColumn();
    int width = lastCol - firstCol + 1;
    SimpleCellWalkContext ctx = new SimpleCellWalkContext();
    Row currentRow = null;
    Cell currentCell = null;
    for (ctx.rowNumber = firstRow;
    ctx.rowNumber <= lastRow;
    ++ctx.rowNumber) {
        currentRow = sheet.getRow(ctx.rowNumber);
        if (currentRow == null) {
            continue;
        }
        for (ctx.colNumber = firstCol;
        ctx.colNumber <= lastCol;
        ++ctx.colNumber) {
            currentCell = currentRow.getCell(ctx.colNumber);
            if (currentCell == null) {
                continue;
            }
            if (isEmptyCell(currentCell) && !traverseEmptyCells) {
                continue;
            }
            ctx.setOrdinalNumber((ctx.rowNumber - firstRow) * width + (ctx.colNumber - firstCol));
            handler.onCell(currentCell, ctx);
        }
    }
}
}