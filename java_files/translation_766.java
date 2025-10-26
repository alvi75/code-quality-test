ublic void removeCellComment() {
    HSSFComment comment2 = getCellComment();
    if (comment2 == null) {
        return;
    }
    (_sheet.getDrawingPatriarch() as HSSFPatriarch).removeShape(comment2);
}