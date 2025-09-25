import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    int startRow = findStartOfRowOutlineGroup(rowNumber);
    getRowRecord(startRow).setColapsed(true);
    int lastRow = writeHidden(getRowRecord(startRow), true);
    if (getRowRecord(lastRow+1) != null) {
        getRowRecord(lastRow+1).setColapsed(true);
    }
    else {
        RowRecord row = createRow(lastRow+1);
        row.setColapsed(true);
        insertRow(row);
    }
}
}