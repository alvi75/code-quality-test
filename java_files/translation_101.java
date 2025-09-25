import java.util.*;

public class Translation101 {
    public SparseIntArray (int initialCapacity) {
    initialCapacity = ArrayUtils.idealIntArraySize(initialCapacity);
    mKeys = new int[initialCapacity];
    mValues = new int[initialCapacity];
    mSize = 0;
}
}