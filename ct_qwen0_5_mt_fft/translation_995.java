import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    final int startRow = findStartOfRowOutlineGroup(rowNumber);
    final RowRecord rowRecord = getRow(startRow);
    final int lastRow = writeHidden(rowRecord, startRow, true);
    if(getRow(lastRow+1)!=null) {
        getRow(lastRow+1).setCollapsed(true);
    }
    else {
        getRow(lastRow).setCollapsed(true);
        insertRow(getRow(lastRow));
    }
}
}