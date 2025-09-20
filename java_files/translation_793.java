import java.util.*;

public class Translation793 {
    public int compareTo(BytesRef other) {
    assert utf8SortedAsUnicodeSortOrder: "cannot compare BytesRef from different SortOrder";
    return compareTo(other, utf8SortedAsUnicodeSortOrder);
}
}