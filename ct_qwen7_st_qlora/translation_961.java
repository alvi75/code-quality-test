import java.util.*;

public class Translation961 {
    public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder();
    if (sheetName != null) {
        sb.append(SheetNameFormatter.format(sheetName)).append("!");
    }
    CellReference crFrom = new CellReference(getFirstRow(), getFirstColumn(),useAbsoluteAddress, useAbsoluteAddress);
    CellReference crTo = new CellReference(getLastRow(), getLastColumn(),useAbsoluteAddress, useAbsoluteAddress);
    sb.append(crFrom.formatAsString());
    if (!crFrom.equals(crTo)|| isFullColumnRange()|| isFullRowRange()) {
        sb.append(":");
        sb.append(crTo.formatAsString());
    }
    return sb.toString();
}
}