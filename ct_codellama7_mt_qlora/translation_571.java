import java.util.*;

public class Translation571 {
    public int compareTo(int[] bs, int p) {
    int cmp;
    cmp = NB.compareUInt32(w1, bs[p]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = NB.compareUInt32(w2, bs[p + 1]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = NB.compareUInt32(w3, bs[p + 2]);
    if (cmp != 0) {
        return cmp;
    }
    cmp = NB.compareUInt32(w4, bs[p + 3]);
    if (cmp != 0) {
        return cmp;
    }
    return NB.compareUInt32(w5, bs[p + 4]);
}
}