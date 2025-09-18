public void writeLong(long v) {
    writeInt((int)(v));
    writeInt((int)(v >> 32));
}