import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    final int firstRow = _range.getFirstRow();
    final int lastRow = _range.getLastRow();
    final int firstCol = _range.getFirstColumn();
    final int lastCol = _range.getLastColumn();
    final int width = lastCol-firstCol+1;
    SimpleCellWalkContext ctx = new SimpleCellWalkContext();
    Row currentRow = null;
    Cell currentCell = null;
    for (ctx.rowNumber=firstRow;
    ctx.rowNumber<=lastRow;
    ++ctx.rowNumber) {
        currentRow = sheet.getRow(ctx.rowNumber);
        if (currentRow==null) continue;
        for (ctx.colNumber=firstCol;
        ctx.colNumber<=lastCol;
        ++ctx.colNumber) {
            currentCell = currentRow.getCell(ctx.colNumber);
            if (currentCell==null) continue;
            if(isEmpty(currentCell)&&!_traverseEmptyCells) continue;
            ctx.ordinalNumber = (ctx.rowNumber-firstRow)*width+(ctx.colNumber-firstCol+1);
            handler.onCell(currentCell, ctx);
        }
    }
}