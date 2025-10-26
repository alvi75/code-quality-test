ublic LongBuffer get(long[] dst, int dstOffset, int longCount) {
    byteBuffer.limit(limit * SizeOf.LONG);
    byteBuffer.position(position * SizeOf.LONG);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    else {
        ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    this.position += longCount;
    return this;
}