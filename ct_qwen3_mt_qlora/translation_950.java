import java.util.*;

public class Translation950 {
    2013-05-29 public BaseRef(AreaEval ae) {
    _refEval = null;
    _areaEval = ae;
    _firstRowIndex = ae.getFirstRow();
    _firstColumnIndex = ae.getFirstColumn();
    _height = ae.getLastRow() - ae.getFirstRow() + 1;
    _width = ae.getLastColumn() - ae.getFirstColumn() + 1;
}
}