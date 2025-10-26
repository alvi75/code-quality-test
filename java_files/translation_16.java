ublic int read(byte[] buffer, int offset, int length) {
    synchronized (this) {
        if (buffer == null) {
            throw new NullPointerException();
        }
        Arrays.checkOffsetAndCount(buffer.length, offset, length);
        if (length == 0) {
            return 0;
        }
        int copyLen = count - pos < length ? count - pos : length;
        {
            for (int i = 0;
            i < copyLen;
            i++) {
                buffer[offset + i] = unchecked((byte)buffer[pos + i]);
            }
        }
        pos += copyLen;
        return copyLen;
    }
}