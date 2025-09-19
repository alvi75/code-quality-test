import java.util.*;

public class Translation961 {
    public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder(32);
    if (sheetName != null) {
        SheetNameFormatter.appendFormat(sb, sheetName);
    }
    sb.append("!");
    sb.append(formatReferenceAsString(useAbsoluteAddress));
    if(isFullColumnRange() || isFullRowRange()) {
        sb.append(':');
        sb.append(getLastCellNum()+1);
        sb.append(')');
    }
    return sb.toString();
}
}