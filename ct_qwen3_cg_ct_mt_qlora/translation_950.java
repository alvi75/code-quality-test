import java.util.*;

public class Translation950 {
    ublic BaseRef(AreaEval ae) {
    _refEval = null;
    _areaEval = ae;
    _firstRowIndex = ae.getFirstRow();
    _firstColumnIndex = ae.getFirstColumn();
    _height = ae.getLastRow() - ae.getFirstRow() + 1;
    _width = ae.getLastColumn() - ae.getFirstColumn() + 1;
}
}