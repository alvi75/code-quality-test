public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference areaRef) {
    super(areaRef);
    this.externalWorkbookNumber = externalWorkbookNumber;
    this.firstSheetName = sheetName.getSheetIdentifier().getName();
    if (sheetName instanceof SheetRangeIdentifier) {
        this.lastSheetName = ((SheetRangeIdentifier)sheetName).getLastSheetIdentifier().getName();
    }
    else {
        this.lastSheetName = null;
    }
}