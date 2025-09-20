import java.util.*;

public class Translation793 {
    ublic int compareTo(Object other) {
    final BytesRef br = (BytesRef) other;
    return utf8SortedAsUnicodeSortOrder.compare(this, br);
}
}