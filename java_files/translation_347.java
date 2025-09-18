public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) {
    if (shortCount > remaining()) {
        throw new BufferUnderflowException();
    }
    System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount);
    position += shortCount;
    return this;
}