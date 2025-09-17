import java.util.*;

public class Translationtranslation_961 {
    public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
        StringBuilder sb = new StringBuilder();
        if (sheetName != null) {
            SheetNameFormatter.appendFormat(sb, sheetName);
        }
        sb.append("!");
        sb.append(formatReferenceAsString(useAbsoluteAddress));
    }
    else if (_isSingleCell) {
        sb.append("SINGLE_CELL");
    }
    else {
        sb.append("RANGE");
        sb.append(' ').append(formatRangeAsString());
    }
    return sb.toString();
    }
}