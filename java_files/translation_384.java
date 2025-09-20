import java.util.*;

public class Translation384 {
    public SparseArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException();
    }
    initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity);
    keys = new int[initialCapacity];
    values = new Object[initialCapacity];
}
}