import java.util.*;

public class Translation101 {
    public SparseIntArray(int initialCapacity) {
    if (initialCapacity >= 0) {
        mKeys = new int[initialCapacity];
        mValues = new int[initialCapacity];
    }
    else {
        throw new IllegalArgumentException("Initial capacity needs to be greater than or equal to zero");
    }
}
}