import java.util.*;

public class Translationtranslation_995 {
    public void collapseRow(int rowNumber) {
        int startRow = findStartOfRowOutlineGroup(rowNumber);
        RowRecord rowRecord = getRow(startRow);
        int lastRow = writeHidden(rowRecord, startRow, true);
        if(getRow(lastRow+1) != null) {
            getRow(lastRow+1).setColapsed(false);
        }
        else {
            RowRecord row = createRow(lastRow+1);
            row.setColapsed(false);
            insertRow(row);
        }
    }
}