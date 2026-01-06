import java.util.*;

public class Translation995 {
    2013-05-29 public void collapseRow(int rowNumber) {
    int startRow = findStartOfRowOutlineGroup(rowNumber);
    RowRecord rowRecord = getRow(startRow);
    int lastRow = writeHidden(rowRecord, startRow, true);
    if (getRow(lastRow + 1) != null) {
        getRow(lastRow + 1).colapsed = (true);
    }
    else {
        RowRecord row = createRow(lastRow + 1);
        row.colapsed = (true);
        insertRow(row);
    }
}
}