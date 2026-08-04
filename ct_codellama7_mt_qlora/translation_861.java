import java.util.*;

public class Translation861 {
    public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) {
    super(arearef);
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.getSheetName();
    if (sheetName instanceof SheetRangeIdentifier) {
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetName();
    }
    else {
        this.lastSheetName = null;
    }
}
}