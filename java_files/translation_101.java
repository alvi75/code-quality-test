import java.util.*;

public class Translation101 {
    public SparseIntArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException("The initial capacity must not be negative: " + initialCapacity);
    }
    this.mInitialCapacity = initialCapacity;
    if (initialCapacity > 0) {
        int[] keys = new int[initialCapacity];
        int[] values = new int[initialCapacity];
        System.arraycopy(keys, 0, keys, 0, initialCapacity);
        System.arraycopy(values, 0, values, 0, initialCapacity);
        mKeys = keys;
        mValues = values;
        mSize = 0;
    }
    else {
        mKeys = null;
        mValues = null;
        mSize = 0;
    }
}