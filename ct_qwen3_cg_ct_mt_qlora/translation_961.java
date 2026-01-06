import java.util.*;

public class Translation961 {
    ublic String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder();
    if (sheetName != null) {
        sb.append(SheetNameFormatter.format(sheetName));
        sb.append("!");
    }
    CellReference cellRefFrom = new CellReference(firstRow, firstColumn, useAbsoluteAddress, useAbsoluteAddress);
    CellReference cellRefTo = new CellReference(lastRow, lastColumn, useAbsoluteAddress, useAbsoluteAddress);
    sb.append(cellRefFrom.formatAsString());
    if (!cellRefFrom.equals(cellRefTo) || isFullColumnRange || isFullRowRange) {
        sb.append(':');
        sb.append(cellRefTo.formatAsString());
    }
    return sb.toString();
}
}