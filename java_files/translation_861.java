import java.util.*;

public class Translation861 {
    ublic Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) {
    super(arearef);
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.sheetId.getName();
    if (sheetName instanceof SheetRangeIdentifier) {
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getName();
    }
    else {
        this.lastSheetName = null;
    }
}
}