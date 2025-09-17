import java.util.*;

public class Translationtranslation_793 {
    public final int compareTo(BytesRef other) {
        final int cmp = utf8SortedAsUnicodeSortOrder.compare(this, other);
        if (cmp != 0) {
            return cmp;
        }
        return bytes.length - other.bytes.length;
    }
}