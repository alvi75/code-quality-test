import java.util.*;

public class Translation186 {
    ublic virtual void Traversal(ICellHandler handler){
    int firstRow = Range.FirstRow;
    int lastRow = Range.LastRow;
    int firstColumn = Range.FirstColumn;
    int lastColumn = Range.LastColumn;
    int width = lastColumn - firstColumn + 1;
    SimpleCellWalkContext ctx = new SimpleCellWalkContext();
    IRow currentRow = null;
    ICell currentCell = null;
    for (ctx.rowNumber = firstRow;
    ctx.rowNumber <= lastRow;
    ++ctx.rowNumber){
        currentRow = Sheet.GetRow(ctx.rowNumber);
        if (currentRow == null){
            continue;
        }
        for (ctx.colNumber = firstColumn;
        ctx.colNumber <= lastColumn;
        ++ctx.colNumber){
            currentCell = currentRow.GetCell(ctx.colNumber);
            if (currentCell == null){
                continue;
            }
            if (IsEmpty(currentCell) && !TraverseEmptyCells){
                continue;
            }
            ctx.ordinalNumber = (ctx.rowNumber - firstRow) * width + (ctx.colNumber - firstColumn + 1);
            handler.OnCell(currentCell, ctx);
        }
    }
}
}