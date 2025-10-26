ublic int readUByte() {
    checkPosition(1);
    return _buf[_readIndex++] & 0xFF;
}