import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    int startRow = findStartOfRowOutlineGroup(rowNumber);
    RowRecord rowRecord = getRow(startRow);
    int endRow = findEndOfRowOutlineGroup(rowNumber);
    if (!isInRange(rowNumber, endRow)) {
        return;
    }
    for (int rowIx = startRow;
    rowIx <= endRow;
    rowIx++) {
        getRow(rowIx).setColapsed(true);
    }
}
}