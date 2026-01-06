import java.util.*;

public class Translation36 {
    ublic ArrayPtg(Object[][] values2d) {
    _nColumns = (short)values2d[0].length;
    _nRows = (short)values2d.length;
    Object[] vv = new Object[_nColumns * _nRows];
    for (int r = 0;
    r < _nRows;
    r++) {
        Object[] rowData = values2d[r];
        for (int c = 0;
        c < _nColumns;
        c++) {
            vv[GetValueIndex(c, r)] = rowData[c];
        }
    }
    _arrayValues = vv;
    _reserved0Int = 0;
    _reserved1Short = 0;
    _reserved2Byte = 0;
}
}