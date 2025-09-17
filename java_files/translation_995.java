import java.util.*;

public class Translationtranslation_995 {
    public void collapseRow(int rowNumber) {
        int startRow = findStartOfRowOutlineGroup(rowNumber);
        RowRecord rowRecord = getRow(startRow);
        int endRow = findEndOfRowOutlineGroup(rowNumber);
        if (!isInRange(rowNumber, endRow)) {
            return;
        }
        getRow(endRow+1).setColapsed(true);
        for (int rowIx = startRow;
        rowIx <= endRow;
        rowIx++) {
            getRow(rowIx).setColapsed(false);
        }
        getRow(endRow+1).setColapsed(false);
    }
}