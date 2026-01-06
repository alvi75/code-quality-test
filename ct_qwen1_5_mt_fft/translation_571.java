import java.util.*;

public class Translation571 {
    public final int compareTo(int[] bs, int p) {
    final int cmp;
    cmp = Int.compareUnsigned(w1, bs[p]);
    if (cmp != 0)return cmp;
    cmp = Int.compareUnsigned(w2, bs[p + 1]);
    if (cmp != 0)return cmp;
    cmp = Int.compareUnsigned(w3, bs[p + 2]);
    if (cmp != 0)return cmp;
    cmp = Int.compareUnsigned(w4, bs[p + 3]);
    if (cmp != 0)return cmp;
    return Int.compareUnsigned(w5, bs[p + 4]);
}
}