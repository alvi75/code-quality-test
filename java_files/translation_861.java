import java.util.*;

public class Translation861 {
    01 public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) {
    super(arearef);
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.SheetId.Name;
    if (sheetName instanceof SheetRangeIdentifier) {
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).LastSheetIdentifier.Name;
    }
    else {
        this.lastSheetName = null;
    }
}
}