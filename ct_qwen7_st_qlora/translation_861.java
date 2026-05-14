import java.util.*;

public class Translation861 {
    public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName,AreaReference arearef) {
    super(arearef);
    _externalWorkbookNumber = externalWorkbookNumber;
    _firstSheetName = sheetName.getSheetIdentifier().getName();
    if(sheetName instanceof SheetRangeIdentifier) {
        _lastSheetName =((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getName();
    }
    else {
        _lastSheetName = null;
    }
}
}