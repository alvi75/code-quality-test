import java.util.*;

public class Translation961 {
    1 public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    2 final StringBuilder sb = new StringBuilder();
    3 if (sheetName != null) {
        4 sb.append(SheetNameFormatter.format(sheetName));
        5 sb.append("!");
        6 }
        7 final CellReference cellRefFrom = new CellReference(firstRow, firstColumn, useAbsoluteAddress, useAbsoluteAddress);
        8 final CellReference cellRefTo = new CellReference(lastRow, lastColumn, useAbsoluteAddress, useAbsoluteAddress);
        9 sb.append(cellRefFrom.formatAsString());
        10 if (!cellRefFrom.equals(cellRefTo) || isFullColumnRange() || isFullRowRange()) {
            11 sb.append(":");
            12 sb.append(cellRefTo.formatAsString());
            13 }
            14 return sb.toString();
        }
}