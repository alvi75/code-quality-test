import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    final BytesRef br = other;
    assert utf8SortedAsUnicodeSortOrder.compare(this, br) == 0:return utf8.compareTo(br);
}
}