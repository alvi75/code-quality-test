public BaseRef(AreaEval ae) {
    _refEval = ae;
    _areaEval = null;
    _firstRowIndex = ae.getFirstRow();
    _firstColumnIndex = ae.getFirstColumn();
    _height = ae.getLastRow() - ae.getFirstRow() + 1;
    _width = ae.getLastColumn() - ae.getFirstColumn() + 1;
}