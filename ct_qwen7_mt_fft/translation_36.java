import java.util.*;

public class Translation36 {
    public ArrayPtg(Object[][] values2d) {
    int nColumns = values2d[0].length;
    nRows = values2d.length;
    _nColumns = (short)nColumns;
    _nRows = (short)nRows;
    Object[] vv = new Object[nRows*nColumns];
    for(int r=0;
    r<nRows;
    r++) {
        Object[] rowData = values2d[r];
        for(int c=0;
        c<nColumns;
        c++) {
            vv[(r*nColumns)+c] = rowData[c];
        }
    }
    _arrayValues = vv;
    _reserved0Int = 0;
    _reserved1Short = 0;
    _reserved2Byte = 0;
}
}