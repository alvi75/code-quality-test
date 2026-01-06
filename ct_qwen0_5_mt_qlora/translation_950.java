import java.util.*;

public class Translation950 {
    public BaseRef(AreaEval ae) {
    this(ae, ae);
    _firstRowIndex = ae.getFirstRow();
    _firstColumnIndex = ae.getFirstColumn();
    _height = ae.getLastRow() - _firstRowIndex + 1;
    _width = ae.getLastColumn() - _firstColumnIndex + 1;
}
}