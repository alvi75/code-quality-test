import java.util.*;

public class Translation785 {
    public Hashtable(int capacity, float loadFactor) {
    if (capacity < 0) {
        throw new IllegalArgumentException("Capacity: " + capacity);
    }
    if (MAXIMUM_CAPACITY < capacity) {
        throw new IllegalArgumentException("Capacity: " + capacity);
    }
    if (loadFactor <= 0f) {
        throw new IllegalArgumentException("Load factor: " + loadFactor);
    }
    makeTable(capacity, loadFactor);
}
}