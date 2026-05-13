import java.util.*;

public class Translation393 {
    public RoaringDocIdSet build() {
    flush();
    return new RoaringDocIdSet(sets, cardinality);
}
}