import java.util.*;

public class Translation866 {
    public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) {
    if(_firstCell == null) {
        return _areaEval.offsetCells(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    else {
        int firstRowIndex = _firstCell.getRowIndex();
        int lastRowIndex = _lastCell.getRowIndex();
        int firstColumnIndex = _firstCell.getColumnIndex();
        int lastColumnIndex = _lastCell.getColumnIndex();
        int relFirstRowIx1 = relFirstRowIx + firstRowIndex;
        int relLastRowIx1 = relLastRowIx + lastRowIndex;
        if (relFirstRowIx1 < 0 || relFirstRowIx1 > MAX_ROW_INDEX) {
            throw new IllegalArgumentException("Invalid row index (" + relFirstRowIx1 + ")");
        }
        if (relLastRowIx1 < 0 || relLastRowIx1 > MAX_ROW_INDEX) {
            throw new IllegalArgumentException("Invalid row index (" + relLastRowIx1 + ")");
        }
        if (relFirstColIx < 0 || relFirstColIx > MAX_COLUMN_INDEX) {
            throw new IllegalArgumentException("Invalid column index (" + relFirstColIx + ")");
        }
        int relLastColIx1 = relLastColIx + firstColumnIndex;
        if (relLastColIx1 < 0 || relLastColIx1 > MAX_COLUMN_INDEX) {
            throw new IllegalArgumentException("Invalid column index (" + relLastColIx1 + ")");
        }
        return new AreaEval(getFirstCell(), relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
}