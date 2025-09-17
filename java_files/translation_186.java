import java.util.*;

public class Translationtranslation_186 {
    public void traverse(CellHandler handler) {
        final int firstRow = range.getFirstRow();
        final int lastRow = range.getLastRow();
        final int firstCol = range.getFirstColumn();
        final int lastCol = range.getLastColumn();
        final int width = lastCol - firstCol + 1;
        SimpleCellWalkContext ctx = new SimpleCellWalkContext();
        for (int row = firstRow;
        row <= lastRow;
        row++) {
            currentRow = sheet.getRow(row);
            if (currentRow == null) {
                continue;
            }
            for (int col = firstCol;
            col <= lastCol;
            col++) {
                currentCell = currentRow.getCell((short)col);
                if (currentCell == null) {
                    continue;
                }
                if (isEmpty(currentCell) && !traverseEmptyCells) {
                    continue;
                }
                ctx.setRow(row);
                ctx.setColumn((short)col);
                ctx.setCell(currentCell);
                ctx.setIndex((row * width) + col);
                handler.onCell(ctx);
            }
        }
    }
}