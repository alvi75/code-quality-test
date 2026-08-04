import java.util.*;

public class Translation793 {
    public int compareTo(Object other) {
    BytesRef br = (BytesRef) other;
    return utf8SortedAsUnicodeSortOrder.compare(this, br);
}
}