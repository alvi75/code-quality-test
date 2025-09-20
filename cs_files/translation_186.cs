using System;
using System.Collections.Generic;

public class Translation186
{
    public override void Traverse(CellHandler handler){
    int firstRow = Range.FirstRow;
    int lastRow = Range.LastRow;
    int firstCol = Range.FirstColumn;
    int lastCol = Range.LastColumn;
    int width = lastCol - firstCol + 1;
    int height = lastRow - firstRow + 1;
    _cache = new CellCache(width * height);
    _workbook = new HSSFEvaluationWorkbook(_cache);
    _sewb = new HSSFEvaluationSheet(_workbook, firstRow, firstCol, lastRow, lastCol);
    _sewb.AddValueRecord(0, _headerRowValues);
    _workbook.RemoveValueRecord(0);
    for (int i = 1;
    i < height;
    ++i){
        CellValueRecordInterface[] rowCells = _sewb.GetValueRecords();
        for (int j = 0;
        j < width;
        ++j){
            if (rowCells[j] != null){
                _workbook.AddValueRecord(j, rowCells[j]);
            }
        }
    }
    ClearValueRecords();
    _workbook.RemoveRow(_sewb.RowValuesStartRecord.Row);
    _workbook.RemoveRow(_sewb.RowValuesEndRecord.Row);
}
}