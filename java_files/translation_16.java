public synchronized int read(byte[] buffer, int offset, int length) {
    if (buffer == null) {
        throw new NullPointerException("buffer == null");
    }
    Arrays.checkOffsetAndCount(buffer.length, offset, length);
    if (length == 0) {
        return 0;
    }
    int copylen = count - pos < length ? count - pos : length;
    for (int i = 0;
    i < copylen;
    i++) {
        buffer[offset + i] = (byte) (this.buffer[pos + i]);
    }
    pos += copylen;
    return copylen;
}