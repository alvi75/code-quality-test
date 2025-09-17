import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_942 {
    public HashMap(int capacity, float loadFactor) {
        if (capacity < 0 || capacity > MAXIMUM_CAPACITY) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        if (loadFactor <= 0) {
            throw new IllegalArgumentException("Load factor: " + loadFactor);
        }
        this.loadFactor = loadFactor;
        table = (HashMapEntry<K, V>[]) EMPTY_TABLE;
        threshold = -1;
    }
}