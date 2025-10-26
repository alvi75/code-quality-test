ublic Cell getCell(int cellnum) {
    return getCell(cellnum & 0x0000FFFF);
}