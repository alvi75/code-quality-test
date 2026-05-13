import java.util.*;

public class Translation36 {
    public ArrayPtg(Object[][] values2D) {
    final int nColumns = values2D[0].length;
    final int nRows = values2D.length;
    field_1_n_columns = (short) nColumns;
    field_2_n_rows = (short) nRows;
    Object[] vv = new Object[field_1_n_columns * field_2_n_rows];
    for(int r=0;
    r<nRows;
    r++) {
        Object[] rowData = values2D[r];
        for(int c=0;
        c<nColumns;
        c++) {
            vv[getValueIndex(c, r)] = rowData[c];
        }
    }
    _arrayValues = vv;
}
}