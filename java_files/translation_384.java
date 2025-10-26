ublic SparseArray(int initialCapacity) {
    initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity);
    keys = new int[initialCapacity];
    values = new Object[initialCapacity];
    size = 0;
}