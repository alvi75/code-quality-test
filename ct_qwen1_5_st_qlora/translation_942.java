import java.util.*;

public class Translation942 {
    public HashMap(int capacity, float loadFactor) {
    this.capacity = capacity;
    init();
    if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
        throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
    }
}
}