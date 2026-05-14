import java.util.*;

public class Translation36 {
    1 public ArrayPtg(Object[][] values2d) {
    2 int nColumns = values2d[0].length;
    3 int nRows = values2d.length;
    4 _nColumns = (short) nColumns;
    5 _nRows = (short) nRows;
    6 Object[] vv = new Object[_nColumns * _nRows];
    7 for (int r = 0;
    r < nRows;
    r++) {
        8 Object[] rowData = values2d[r];
        9 for (int c = 0;
        c < nColumns;
        c++) {
            10 vv[getValueIndex(c, r)] = rowData[c];
            11 }
            12 }
            13 _arrayValues = vv;
            14 _reserved0Int = 0;
            15 _reserved1Short = 0;
            16 _reserved2Byte = 0;
        }
}