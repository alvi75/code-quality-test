import java.util.*;

public class Translation995 {
    public void collapseRow(int rowNumber) {
    final int startRow = findStartOfRowOutlineGroup(rowNumber);
    _rows.remove(startRow+1,startRow+2);
    _lastRow=_currentRow-1;
}
}