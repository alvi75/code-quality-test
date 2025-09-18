public SparseIntArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException();
    }
    capacity = initialCapacity;
}