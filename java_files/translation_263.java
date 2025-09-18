public boolean eat(Row in, int rowInRowData) {
    int sum = 0;
    for (Cell c : in.cells.values()) {
        sum += c.cnt;
        if (c.ref >= 0) {
            if (rowInRowData == -1 || c.row == rowInRowData) {
                c.ref = -1;
            }
        }
    }
    int frame = sum / 10;
    boolean live = false;
    for (Cell c : in.cells.values()) {
        if (c.cnt < frame) {
            c.cnt = 0;
        }
        if (c.cmd >= 0) {
            if (rowInRowData != -1 && c.row == rowInRowData) {
                c.ref = -1;
            }
            c.cnt = Math.min(c.cnt, frame);
        }
    }
}
return !live;
}