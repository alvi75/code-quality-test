import java.util.*;

public class Translation793 {
    public final int compareTo(Object o) {
    assert o instanceof BytesRef;
    final BytesRef b = (BytesRef)o;
    return utf8SortedAsUnicodeSortOrder.compare(this, b);
}
}