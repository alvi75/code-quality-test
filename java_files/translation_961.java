public String formatAsString(String sheetName, boolean useAbsoluteAddress) {
    StringBuilder sb = new StringBuilder();
    if (sheetName != null) {
        sb.append(getSheetName(sheetName)).append("!");
    }
    String reference = this.getReference();
    if (useAbsoluteAddress) {
        sb.append('A');
        int firstSheetIndex = getFirstSheetIndex();
        if (firstSheetIndex == -1) {
            throw new IllegalArgumentException("Referenced sheet could not be found");
        }
        sb.append(firstSheetIndex);
        sb.append("!");
    }
    sb.append(reference);
    return sb.toString();
}