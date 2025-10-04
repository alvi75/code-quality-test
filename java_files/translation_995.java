import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    int startRow = findStartOfRowOutlineGroup(rowNumber);
    RowRecord rowRecord = getRow(startRow);
    int endRow = writeHidden(rowRecord, startRow, true);
    getRow(endRow).setColapsed(true);
}
}