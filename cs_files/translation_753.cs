using System;
using System.Collections.Generic;

public class Translation753
{
    public void RemoveSheet(int sheetIndex){
    if (boundsheets.Count > sheetIndex){
        records.Remove(records.Bspos - (boundsheets.Count - 1) + sheetIndex);
        boundsheets.RemoveAt(sheetIndex);
        FixTabIdRecord();
    }
    int sheetNum1Based = sheetIndex + 1;
    for (int i = 0;
    i < NumNames;
    i++){
        NameRecord nr = GetNameRecord(i);
        if (nr.SheetNumber == sheetNum1Based){
            nr.SheetNumber = 0;
        }
        else if (nr.SheetNumber > sheetNum1Based){
            nr.SheetNumber = nr.SheetNumber - 1;
        }
    }
    if (linkTable != null)linkTable.RemoveSheet(sheetIndex);
}
}