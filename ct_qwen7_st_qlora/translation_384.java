import java.util.*;

public class Translation384 {
    public SparseArray(int initialCapacity) {
    if (initialCapacity >= 0) {
        mKeys = new int[initialCapacity];
        mValues = new Object[initialCapacity];
    }
    else {
        throw new IllegalArgumentException("Initial capacity needs to be greater than or equal to zero");
    }
}
}