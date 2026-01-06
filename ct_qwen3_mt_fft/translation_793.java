import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    assert other != null;
    return utf8SortedAsUnicodeSortOrder.compare(this, other);
}
}