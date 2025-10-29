import java.util.*;

public class Translation950 {
    public BaseRef(AreaEval ae) {
    _refEval = null;
    _areaEval = ae;
    _firstRowIndex = ae.getFirstRow();
    _firstColumnIndex = ae.getFirstColumn();
    _height = ae.getLastRow() - _firstRow + 1;
    _width = ae.getLastColumn() - _firstColumn + 1;
}
}