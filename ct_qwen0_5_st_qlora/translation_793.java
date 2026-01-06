import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    final BytesRef br = other;
    assert br != null;
    return utf8SortedAsUnicodeSortOrder.compare(this, br);
}
}