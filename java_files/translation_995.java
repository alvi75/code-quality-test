ublic void collapseRow(int rowNumber) {
    int startRow = findStartOfRowOutlineGroup(rowNumber);
    RowRecord rowRecord = getRow(startRow);
    int lastRow = writeHidden(rowRecord, startRow, true);
    if (getRow(lastRow+1) != null) {
        getRow(lastRow+1).setCollapsed(true);
    }
    else {
        RowRecord row = createRow(lastRow+1);
        row.setCollapsed(true);
        insertRow(row);
    }
}