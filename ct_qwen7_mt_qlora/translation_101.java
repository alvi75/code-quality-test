import java.util.*;

public class Translation101 {
    1 public SparseIntArray(int initialCapacity) {
    2 if (initialCapacity < 0) {
        3 throw new IllegalArgumentException("Initial capacity cannot be negative");
        4 }
        5 mGarbage = false;
        6 mKeys = new int[initialCapacity];
        7 mValues = new int[initialCapacity];
        8 mSize = 0;
    }
}