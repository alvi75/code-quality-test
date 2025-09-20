using System;
using System.Collections.Generic;

public class Translation961
{
    public String FormatAsString(String sheetName, bool useAbsoluteAddress){
    StringBuilder sb = new StringBuilder();
    if (sheetName != null){
        sb.Append(GetSheetNameAsText(sheetName)).Append("!");
    }
    CellReference cellRefFrom = new CellReference(FirstRow, FirstColumn, useAbsoluteAddress, useAbsoluteAddress);
    CellReference cellRefTo = new CellReference(LastRow, LastColumn, useAbsoluteAddress, useAbsoluteAddress);
    sb.Append(cellRefFrom.FormatAsString());
    if (!cellRefFrom.Equals(cellRefTo) || IsFullColumnRange || IsFullRowRange){
        sb.Append(':');
        sb.Append(cellRefTo.FormatAsString());
    }
    return sb.ToString();
}
}