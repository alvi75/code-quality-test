using System;
using System.Collections.Generic;

public class Translation33
{
    public void AddMultipleBlanks(MulBlankRecord mbr){
    for (int j = 0;
    j < mbr.NumColumns;
    j++){
        BlankRecord br = new BlankRecord();
        br.Column = ((short)(j + mbr.FirstColumn));
        br.Row = mbr.Row;
        br.XFIndex = mbr.GetXFAt(j);
        mbrCellList.Add(br);
    }
}
}