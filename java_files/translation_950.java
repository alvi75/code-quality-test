import java.util.*;

public class Translation950 {
    public BaseRef(AreaEval ae) {
    this._refEval = null;
    this._areaEval = ae;
    this._firstRowIndex = ae.getFirstRow();
    this._firstColumnIndex = ae.getFirstCol();
    this._height = ae.getLastRow() - ae.getFirstRow() + 1;
    this._width = ae.getLastCol() - ae.getFirstCol() + 1;
}
}