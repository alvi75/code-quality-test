ublic int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) {
    return linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber);
}