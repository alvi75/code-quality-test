public float get(int index) {
    checkIndex(index);
    return byteBuffer.getFloat(index * SizeOf.FLOAT);
}