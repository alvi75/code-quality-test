ublic ArrayPtg(Object[][] values2d) {
    int nColumns = values2d[0].Length;
    int nRows = values2d.Length;
    _nColumns = (short)nColumns;
    _nRows = (short)nRows;
    Object[] vv = new Object[_nColumns * _nRows];
    for (int r = 0;
    r < nRows;
    r++) {
        Object[] rowData = values2d[r];
        for (int c = 0;
        c < nColumns;
        c++) {
            vv[getValueIndex(c, r)] = rowData[c];
        }
    }
    _arrayValues = vv;
    _reserved0Int = 0;
    _reserved1Short = 0;
    _reserved2Byte = 0;
}