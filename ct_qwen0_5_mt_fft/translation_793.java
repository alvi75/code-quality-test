import java.util.*;

public class Translation793 {
    public int compareTo(Object o) {
    if (o instanceof BytesRef) {
        BytesRef br = (BytesRef)o;
        assert br != null;
        return utf8SortedAsUnicodeSortOrder.compare(this, br);
    }
    throw new System.NotSupportedException();
}
}