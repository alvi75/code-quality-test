import java.util.*;

public class Translation186 {
    public void traverse(CellHandler handler) {
    final int firstRow = getFirstRow();
    final int lastRow = getLastRow();
    final int firstColumn = getFirstColumn();
    final int lastColumn = getLastColumn();
    final int width = lastColumn - firstColumn + 1;
    final CellWalkContext ctx = new CellWalkContext();
    for (int rowNumber = firstRow;
    rowNumber <= lastRow;
    ++rowNumber) {
        final Row currentRow = sheet.getRow(rowNumber);
        if (currentRow == null) {
            continue;
        }
        for (int colNumber = firstColumn;
        colNumber <= lastColumn;
        ++colNumber) {
            final Cell currentCell = currentRow.getCell(colNumber);
            if (isEmpty(currentCell) && !traverseEmptyCells) {
                continue;
            }
            ctx.setRowNumber(rowNumber);
            ctx.setColumnNumber(colNumber);
            ctx.setOrdinalNumber((rowNumber - firstRow) * width + (colNumber - firstColumn + 1));
            handler.onCell(currentCell, ctx);
        }
    }
}
}