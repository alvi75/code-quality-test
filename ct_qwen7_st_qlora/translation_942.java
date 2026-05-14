import java.util.*;

public class Translation942 {
    public HashMap(int capacity, float loadFactor) {
    if (capacity < 0) {
        throw new IllegalArgumentException("Capacity: " + capacity);
    }
    if (Float.isNaN(loadFactor) || loadFactor <= 0) {
        throw new IllegalArgumentException("Load factor: " + loadFactor);
    }
    makeTable(capacity, loadFactor);
}
}