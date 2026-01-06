import java.util.*;

public class Translation942 {
    public HashMap(int capacity, float loadFactor) {
    this(capacity);
    if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
        throw new IllegalArgumentException("Load factor: " + loadFactor);
    }
    else if (capacity < 0) {
        throw new IllegalArgumentException("Capacity must be positive (got " + capacity + ")");
    }
    else if (capacity == 0) {
        capacity = 1;
    }
}
}