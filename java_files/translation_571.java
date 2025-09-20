import java.util.*;

public class Translation571 {
    public int compareTo(int[] bs, int p) {
    int cmp;
    cmp = NB.compareUInt32(w1, bs[p]);
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w2, bs[1+p]);
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w3, bs[2+p]);
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w4, bs[3+p]);
    if (cmp != 0)return cmp;
    return NB.compareUInt32(w5, bs[4+p]);
}
}