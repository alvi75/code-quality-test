import java.util.*;

public class Translation36 {
    public ArrayPtg(Object[][] values2d) {
    int nColumns = values2d[0].length;
    int nRows = values2d.length;
    _nColumns = (short)nColumns;
    _nRows = (short)nRows;
    final int size = nColumns * nRows;
    _arrayValues = new Object[size];
    Arrays.fill(_arrayValues, null);
    for(int r=0;
    r<nRows;
    r++) {
        Object[] rowData = values2d[r];
        for(int c=0;
        c<nColumns;
        c++) {
            _arrayValues[getValueIndex(c,r)] = rowData[c];
        }
    }
}
}