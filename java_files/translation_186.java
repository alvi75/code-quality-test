import java.util.*;

public class Translation186 {
    ublic void traverse(CellVisitor visitor) {
    int firstRow = _range.getFirstRow();
    int lastRow = _range.getLastRow();
    int firstColumn = _range.getFirstColumn();
    int lastColumn = _range.getLastColumn();
    int width = lastColumn - firstColumn + 1;
    SimpleCellWalkContext ctx = new SimpleCellWalkContext(visitor);
    IRow currentRow = null;
    ICell currentCell = null;
    for (ctx.rowNumber = firstRow;
    ctx.rowNumber <= lastRow;
    ++ctx.rowNumber) {
        currentRow = sheet.getRow(ctx.rowNumber);
        if (currentRow == null) {
            continue;
        }
        for (ctx.colNumber = firstColumn;
        ctx.colNumber <= lastColumn;
        ++ctx.colNumber) {
            currentCell = currentRow.getCell(ctx.colNumber);
            if (currentCell == null) {
                continue;
            }
            if (isEmpty(currentCell) && !traverseEmptyCells) {
                continue;
            }
            ctx.ordinalNumber = (ctx.rowNumber - firstRow) * width + (ctx.colNumber - firstColumn + 1);
            visitor.onCell(currentCell, ctx);
        }
    }
}
}