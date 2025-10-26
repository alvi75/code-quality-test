ublic long getLong() throws IOException {
    if (byteBuffer.position() == byteBuffer.limit()) {
        throw new BufferUnderflowException();
    }
    int newPosition = byteBuffer.position() + SizeOf.LONG;
    if (newPosition > byteBuffer.limit()) {
        throw new BufferUnderflowException();
    }
    long result = Memory.peekLong(byteBuffer, byteBuffer.position(), order);
    byteBuffer.position(newPosition);
    return result;
}