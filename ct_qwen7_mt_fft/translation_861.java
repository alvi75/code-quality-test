import java.util.*;

public class Translation861 {
    public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName,AreaReference arearef) {
    super(arearef);
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.getSheetIdentifier();
    if(sheetName instanceof SheetRangeIdentifier) {
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getSheetIdentifier();
    }
    else {
        this.lastSheetName = null;
    }
}
}