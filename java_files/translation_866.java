import java.util.*;

public class Translationtranslation_866 {
    public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) {
        if(_refEval == null) {
            return _areaEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
        }
        _firstCellOffset = CellRangeAddress.ZERO;
        int width = _lastCell.getCol() - _firstCell.getCol();
        int height = _lastCell.getRow() - _firstCell.getRow();
        _regions = new CellRangeAddress[1];
        _regions[0] = new CellRangeAddress(_firstCell.getRow(), _lastCell.getRow(), _firstCell.getCol(), _lastCell.getCol());
        return _refEval.offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
}