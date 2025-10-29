import java.util.*;

public class Translation961 {
    0;
int lastColumn = getEndColumn();
boolean useAbsoluteAddress = true;
String sheetName = getSheetName();
if (sheetName != null) {
    sb.append(SheetNameFormatter.format(sheetName));
    sb.append("!");
}
CellReference cellRefFrom = new CellReference(firstRow, firstColumn, useAbsoluteAddress, useAbsoluteAddress);
CellReference cellRefTo = new CellReference(lastRow, lastColumn, useAbsoluteAddress, useAbsoluteAddress);
sb.append(cellRefFrom.formatAsString());
if (!cellRefFrom.equals(cellRefTo) || isFullColumnRange() || isFullRowRange()) {
    sb.append(':');
    sb.append(cellRefTo.formatAsString());
}
return sb.toString();
}
}