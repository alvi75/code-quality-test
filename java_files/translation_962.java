public ByteBuffer put(int index, byte value) {
    throw new ReadOnlyBufferException();
}