import java.util.*;

public class Translation384 {
    public SparseArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
    }
    if (initialCapacity == 0) {
        initialCapacity = 1;
    }
    else if (initialCapacity > Integer.MAX_VALUE) {
        throw new OutOfMemoryError();
    }
    else {
        initialCapacity = android.util.Arrays.idealIntArraySize(initialCapacity);
    }
    keys = new int[initialCapacity];
    values = new Object[initialCapacity];
}
}