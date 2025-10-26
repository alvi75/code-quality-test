ublic BaseRef(AreaEval ae) {
    this._refEval = null;
    this._areaEval = ae;
    this._firstRowIndex = ae.getFirstRow();
    this._firstColumnIndex = ae.getFirstColumn();
    this._height = ae.getLastRow() - this._firstRow + 1;
    this._width = ae.getLastColumn() - this._firstColumn + 1;
}