ublic FloatBuffer Slice() {
    return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position);
}