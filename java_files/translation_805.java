ublic IntBuffer Slice() {
    return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position);
}