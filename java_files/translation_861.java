import java.util.*;

public class Translation861 {
    ublic Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) : base(arearef){
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.getSheetId().getName();
    if (sheetName instanceof SheetRangeIdentifier){
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getName();
    }
    else{
        this.lastSheetName = null;
    }
}
}