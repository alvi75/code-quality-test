import java.util.*;

public class Translation393 {
    public WAH8DocIdSet build() {
    flush();
    return new WAH8DocIdSet(wah.bits, wah.numBits, docIDs, offsets);
}
}