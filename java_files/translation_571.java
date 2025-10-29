import java.util.*;

public class Translation571 {
    public int compareTo(int[] bs) {
    int cmp;
    cmp = w1.compareTo(bs[p]);
    if (cmp != 0)return cmp;
    cmp = w2.compareTo(bs[p + 1]);
    if (cmp != 0)return cmp;
    cmp = w3.compareTo(bs[p + 2]);
    if (cmp != 0)return cmp;
    cmp = w4.compareTo(bs[p + 3]);
    if (cmp != 0)return cmp;
    cmp = w5.compareTo(bs[p + 4]);
    if (cmp != 0)return cmp;
    return w6.compareTo(bs[p + 5]);
}
}