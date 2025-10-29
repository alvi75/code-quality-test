import java.util.*;

public class Translation995 {
    0;
int lastRow = writeHidden(rowRecord, startRow, true);
if (getRow(lastRow + 1) != null) {
    getRow(lastRow + 1).Collapsed = true;
}
else {
    RowRecord row = createRow(lastRow + 1);
    row.Collapsed = true;
    insertRow(row);
}
}
}