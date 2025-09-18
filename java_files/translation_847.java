public HSSFCell getCell(int cellnum) {
    short shortCellNum = (short)cellnum;
    return getCell(shortCellNum, false);
}