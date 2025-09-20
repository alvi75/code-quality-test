using System;
using System.Collections.Generic;

public class Translation861
{
    public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef): base(arearef){
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.SheetId.Name;
    if (sheetName is SheetRangeIdentifier){
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).LastSheetIdentifier.Name;
    }
    else{
        this.lastSheetName = null;
    }
    this.workbook = arearef.Workbook;
}
}