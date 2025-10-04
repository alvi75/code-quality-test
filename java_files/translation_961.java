import java.util.*;

public class Translation961 {
    public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder();
    if (sheetName != null) {
        sb.append(FormulaShifter.shiftSheetName(sheetName, _firstCell.isInSameSheetAs(_lastCell)));
    }
    sb.append(" ! ");
    sb.append(formatReferenceAsString());
    return sb.toString();
}
}