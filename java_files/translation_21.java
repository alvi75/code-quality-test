public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) throws IOException {
    final int available = bufferLength-bufferPosition;
    if (len <= available) {
        if (len > 0) {
            System.arraycopy(buffer, bufferPosition, b, offset, len);
        }
        bufferPosition += len;
    }
    else {
        if (available > 0) {
            System.arraycopy(buffer, bufferPosition, b, offset, available);
            bufferPosition += available;
        }
        if (useBuffer && len < bufferSize) {
            refill();
            if (bufferLength < len) {
                System.arraycopy(buffer, 0, b, offset, bufferLength);
                throw new EOFException("read past EOF: "+this);
            }
            else {
                System.arraycopy(buffer, 0, b, offset, len);
                bufferPosition = len;
            }
        }
        else {
            final long after = bufferStart + bufferPosition + len;
            if (after > length) {
                throw new EOFException("read past EOF: "+this);
            }
            read(b, offset, len);
            bufferStart = after;
            bufferPosition = 0;
            bufferLength = 0;
        }
    }
}