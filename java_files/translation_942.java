import java.util.*;

public class Translation942 {
    ublic HashMap(int capacity, float loadFactor) {
    this(capacity);
    if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
        throw new IllegalArgumentException("Load factor: " + loadFactor);
    }
    this.loadFactor = loadFactor;
    this.threshold = capacity * loadFactor;
}
}