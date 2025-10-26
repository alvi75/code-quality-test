ublic ShortBuffer slice() {
    return new ReadWriteShortArrayBuffer(this, remaining(), backingArray, offset + position);
}