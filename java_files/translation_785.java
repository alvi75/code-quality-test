import java.util.*;

public class Translation785 {
    ublic Hashtable(int capacity, float loadFactor) {
    if (capacity < 0 || capacity > MAXIMUM_CAPACITY) {
        throw new IllegalArgumentException("Capacity: " + capacity);
    }
    if (loadFactor <= 0) {
        throw new IllegalArgumentException("Load factor: " + loadFactor);
    }
    this.loadFactor = loadFactor;
    table = (HashtableEntry<K, V>[]) EMPTY_TABLE;
    threshold = -1;
    rehash();
}
}