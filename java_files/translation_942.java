import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_942 {
    public HashMap(int capacity, float loadFactor) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        if (loadFactor <= 0.0) {
            throw new IllegalArgumentException("Load Factor: " + loadFactor);
        }
        if (capacity == 0) {
            @SuppressWarnings("unchecked")HashMapEntry<K, V>[] tab = (HashMapEntry<K, V>[]) EMPTY_TABLE;
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
}