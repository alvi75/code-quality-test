import java.util.*;

public class Translation36 {
    public ArrayPtg(Object[][] values2d) {
    _nColumns = values2d[0].length;
    _nRows = values2d.length;
    _arrayValues = new Object[_nColumns*_nRows];
    for(int r=0;
    r<_nRows;
    r++) {
        Object[] rowData = values2d[r];
        for(int c=0;
        c<_nColumns;
        c++) {
            _arrayValues[getValueIndex(c,r)] = rowData[c];
        }
    }
}
}