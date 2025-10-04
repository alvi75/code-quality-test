import java.util.*;

public class Translation753 {
    public void removeSheet(int sheetIndex) {
    if (sheetIndex >= _externSheetRecord.getNumOfSchemes()) {
        throw new IllegalArgumentException("Invalid sheet index: " + sheetIndex+ ".");
    }
    _externSheetRecord.removeSheet(sheetIndex);
}
}