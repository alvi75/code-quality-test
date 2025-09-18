public int readUByte() {
    checkPosition(1);
    return readByte() & 0xFF;
}