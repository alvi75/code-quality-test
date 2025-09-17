import java.util.*;

public class Translationtranslation_186 {
    public void traverse(CellHandler handler) {
        int firstRow = range.getFirstRow();
        int lastRow = range.getLastRow();
        int firstCol = range.getFirstColumn();
        int lastCol = range.getLastColumn();
        int width = lastCol - firstCol + 1;
        int height = lastRow - firstRow + 1;
        _colors.ensureCapacity(width * height);
        for (int x = firstCol;
        x <= lastCol;
        x++) {
            for (int y = firstRow;
            y <= lastRow;
            y++) {
                int index = (y * width) + x;
                _colors.add(new CellRangeAddress(x, x + width, y, y + height));
            }
        }
}