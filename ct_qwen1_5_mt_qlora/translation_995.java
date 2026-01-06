import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    final int startRow = findStartOfRowOutlineGroup(rowNumber);
    final RowRecord rowRecord = getRow(startRow);
    final int lastRow = writeHidden(rowRecord, startRow, true);
    if (getRow(lastRow + 1) != null) {
        getRow(lastRow + 1).setCollapsed(true);
    }
    else {
        final RowRecord row = createRow(lastRow + 1);
        row.setCollapsed(true);
        insertRow(row);
    }
}
}