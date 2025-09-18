public void traverse(CellHandler handler) {
    int firstRow = range.getFirstRow();
    int lastRow = range.getLastRow();
    int firstCol = range.getFirstColumn();
    int lastCol = range.getLastColumn();
    int width = lastCol - firstCol + 1;
    int height = lastRow - firstRow + 1;
    _cache = new CellCache(width * height);
    _workbook = new HSSFEvaluationWorkbook(_cache);
    _sewb = new HSSFEvaluationSheet(_workbook, range);
    Iterator<Cell> it = _sewb.getCells().iterator();
    HSSFCell cell = null;
    while (it.hasNext()) {
        cell = it.next();
        if (cell instanceof HSSFCell) {
            HSSFCell sfCell = (HSSFCell) cell;
            sfCell.setCellValueHandler(handler);
        }
    }
}