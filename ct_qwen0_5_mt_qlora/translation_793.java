import java.util.*;

public class Translation793 {
    public int compareTo(Object other) {
    if (other == null) {
        return -1;
    }
    if (other instanceof BytesRef) {
        return utf8SortedAsUnicodeSortOrder.compareTo(this, (BytesRef)other);
    }
    throw new IllegalArgumentException("Can't compare " + this + " with " + other);
}
}