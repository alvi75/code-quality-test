public RandomAccessFile(String fileName, String mode) throws FileNotFoundException {
    this(new File(fileName), mode);
}