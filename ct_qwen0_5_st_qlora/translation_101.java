import java.util.*;

public class Translation101 {
    public SparseIntArray(int initialCapacity) {
    if (initialCapacity < 0) {
        throw new IllegalArgumentException();
    }
    else {
        initialCapacity = android.util.Arrays.idealIntArraySize(initialCapacity);
        keys = new int[initialCapacity];
        values = new int[initialCapacity];
        size = 0;
    }
}
}