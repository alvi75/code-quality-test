import java.util.*;

public class Translation571 {
    public int compareTo(final int[] bs, final int p) {
    final int cmp = ByteUtil.compareUnsignedInts(w1, bs[p]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = ByteUtil.compareUnsignedInts(w2, bs[p + 1]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = ByteUtil.compareUnsignedInts(w3, bs[p + 2]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = ByteUtil.compareUnsignedInts(w4, bs[p + 3]);
    if (cmp != 0) {
        return cmp;
    }
    return ByteUtil.compareUnsignedInts(w5, bs[p + 4]);
}
}