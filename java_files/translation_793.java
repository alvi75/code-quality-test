import java.util.*;

public class Translation793 {
    ublic int compareTo(Object o) {
    if (o == null) {
        return -1;
    }
    if (!(o instanceof BytesRef)) {
        throw new IllegalArgumentException("Object is not a BytesRef");
    }
    return utf8SortedAsUnicodeSortOrder.compareTo(this, (BytesRef)o);
}
}