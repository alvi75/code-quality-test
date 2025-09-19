import java.util.*;

public class Translation571 {
    public final int compareTo(byte[] bs, int p) {
    int cmp;
    cmp = NB.compareUInt32(w1, NB.decodeInt32(bs, p));
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w2, NB.decodeInt32(bs, p + 4));
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w3, NB.decodeInt32(bs, p + 8));
    if (cmp != 0)return cmp;
    cmp = NB.compareUInt32(w4, NB.decodeInt32(bs, p + 12));
    if (cmp != 0)return cmp;
    return NB.compareUInt32(w5, NB.decodeInt32(bs, p + 16));
}
}