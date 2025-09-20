using System;
using System.Collections.Generic;

public class Translation30
{
    public String GetSheetName(int sheetIndex){
    return GetBoundSheetRec(sheetIndex).Sheetname;
}
}