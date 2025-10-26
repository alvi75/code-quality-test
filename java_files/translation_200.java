ublic void write(byte[] b) {
    int len = b.length;
    checkPosition(len);
    System.arraycopy(b, 0, buf, writeIndex, len);
    writeIndex += len;
}