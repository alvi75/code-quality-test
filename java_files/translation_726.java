public CharBuffer put(char[] src, int srcOffset, int charCount) {
    byteBuffer.limit(limit * SizeOf.CHAR);
    byteBuffer.position(position * SizeOf.CHAR);
    if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    this.position += charCount;
    return this;
}