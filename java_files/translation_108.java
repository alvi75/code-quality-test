ublic Color getColor(short index) {
    if (index == HSSFColor.Automatic.Index) return HSSFColor.Automatic.getInstance();
    else {
        byte[] b = palette.getColor(index);
        if (b != null) return new CustomColor(index, b);
    }
}