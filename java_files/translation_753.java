ublic void removeSheet(int sheetIndex) {
    if (boundsheets.size() > sheetIndex) {
        records.remove(records.bspos - (boundsheets.size() - 1) + sheetIndex);
        boundsheets.remove(sheetIndex);
        fixTabIdRecord();
    }
    int sheetNum1Based = sheetIndex + 1;
    for (int i = 0;
    i < nameRecords.length;
    i++) {
        NameRecord nr = nameRecords[i];
        if (nr.sheetNumber == sheetNum1Based) {
            nr.sheetNumber = (0);
        }
        else if (nr.sheetNumber > sheetNum1Based) {
            nr.sheetNumber = (nr.sheetNumber - 1);
        }
    }
    if (linkTable != null) {
        for (int i = sheetIndex + 1;
        i < boundsheets.size() + 1;
        i++) {
            linkTable.removeSheet(i);
        }
    }
}