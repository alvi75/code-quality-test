using System;
using System.Collections.Generic;

public class Translation995
{
    public void CollapseRow(int rowNumber){
    int startRow = FindStartOfRowOutlineGroup(rowNumber);
    RowRecord rowRecord = GetRow(startRow);
    int nextRowIx = WriteHidden(rowRecord, startRow);
    RowRecord row = GetRow(nextRowIx);
    if (row == null){
        row = CreateRow(nextRowIx);
        InsertRow(row);
    }
    row.Colapsed = true;
}
}