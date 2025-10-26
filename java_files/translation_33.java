ublic void addMultipleBlanks(MulBlankRecord mbr) {
    for (int j = 0;
    j < mbr.getNumColumns();
    j++) {
        BlankRecord br = new BlankRecord();
        br.setColumn(j + mbr.getFirstColumn());
        br.setRow(mbr.getRow());
        br.setXfIndex((mbr.getXFAt(j)));
        insertCell(br);
    }
}