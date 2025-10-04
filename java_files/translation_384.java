import java.util.*;

public class Translation384 {
    public SparseArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException("Initial capacity must be positive");
    }
    array = new int[initialCapacity];
    values = new Object[initialCapacity];
    size = 0;
}
}