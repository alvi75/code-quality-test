import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    int firstRow = range.getFirstRow();
    int lastRow = range.getLastRow();
    int firstColumn = range.getFirstColumn();
    int lastColumn = range.getLastColumn();
    int width = lastColumn - firstColumn + 1;
    SimpleCellWalkContext ctx = new SimpleCellWalkContext();
    Cell cell = null;
    for (ctx.rowNumber = firstRow;
    ctx.rowNumber <= lastRow;
    ++ctx.rowNumber) {
        cell = _sheet.getRow(ctx.rowNumber);
        if (cell == null) continue;
        if (cell.isEmpty() && !traverseEmptyCells) continue;
        ctx.ordinalNumber = (ctx.rowNumber - firstRow) * width +(ctx.colNumber - firstColumn + 1);
        handler.onCell(cell, ctx);
    }
}
}