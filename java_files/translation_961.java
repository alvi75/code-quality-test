import java.util.*;

public class Translation961 {
    public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder();
    if (sheetName != null) {
        sb.append(SheetNameFormatter.format(sheetName));
        sb.append("!");
    }
    CellReference cellRefFrom = new CellReference(FirstRow, FirstColumn,useAbsoluteAddress, useAbsoluteAddress);
    CellReference cellRefTo = new CellReference(LastRow, LastColumn,useAbsoluteAddress, useAbsoluteAddress);
    sb.append(cellRefFrom.formatAsString());
    if (!cellRefFrom.equals(cellRefTo) || IsFullColumnRange || IsFullRowRange) {
        sb.append(':');
        sb.append(cellRefTo.formatAsString());
    }
    return sb.toString();
}
}