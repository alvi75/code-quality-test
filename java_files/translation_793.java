import java.util.*;

public class Translationtranslation_793 {
    public int compareTo(BytesRef other) {
        assert bytesStart != other.bytesStart: "bytesStart is the same for both strings";
        int compare = bytesStart - other.bytesStart;
        if (compare != 0) {
            return compare;
        }
        return utf8SortedAsUnicodeSortOrder.compare(this, other);
    }
}