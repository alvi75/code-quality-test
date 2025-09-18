public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) {
    super(bookName, firstSheetIdentifier, lastSheetIdentifier);
    this.firstSheetIdentifier = firstSheetIdentifier;
    this.lastSheetIdentifier = lastSheetIdentifier;
}