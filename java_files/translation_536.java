ublic boolean contains(int row, int col) {
    return firstRow <= row && lastRow >= row && firstColumn <= col && lastColumn >= col;
}