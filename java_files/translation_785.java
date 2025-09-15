import java.util.*;

public class Translationtranslation_785 {
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
        int min = java.util.Collections.min(capacity, MINIMUM_CAPACITY);
        int max = java.util.Collections.max(capacity, MAXIMUM_CAPACITY);
        if (max < MINIMUM_CAPACITY) {
            max = MINIMUM_CAPACITY;
        }
        makeTable(max);
    }
}