public Hashtable(int capacity, float loadFactor) {
    if (capacity < 0) {
        throw new IllegalArgumentException("Capacity: " + capacity);
    }
    if (loadFactor <= 0.0) {
        throw new IllegalArgumentException("Load Factor: " + loadFactor);
    }
    if (capacity == 0) {
        @SuppressWarnings("unchecked")HashtableEntry<K, V>[] tab = (HashtableEntry<K, V>[]) EMPTY_TABLE;
        table = tab;
        threshold = -1;
        return;
    }
    if (capacity < MINIMUM_CAPACITY) {
        capacity = MINIMUM_CAPACITY;
    }
    else if (capacity > MAXIMUM_CAPACITY) {
        capacity = MAXIMUM_CAPACITY;
    }
    else {
        capacity = roundUpToPowerOfTwo(capacity);
    }
    makeTable(capacity);
}