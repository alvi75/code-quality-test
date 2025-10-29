import java.util.*;

public class Translation950 {
    0) {
    throw new ArgumentException("Invalid area reference");
}
if (ae.FirstRow < 0 || ae.LastRow < 0 || ae.FirstColumn < 0 || ae.LastColumn < 0) {
    throw new ArgumentException("Invalid area reference");
}
this._refEval = null;
this._areaEval = ae;
this._firstRowIndex = ae.FirstRow;
this._firstColumnIndex = ae.FirstColumn;
this._height = ae.LastRow - ae.FirstRow + 1;
this._width = ae.LastColumn - ae.FirstColumn + 1;
}
}