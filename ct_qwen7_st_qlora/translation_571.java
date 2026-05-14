import java.util.*;

public class Translation571 {
    public final int compareTo(long other) {
    long d;
    if ((d = w1 - other >>> 32) == 0L)if ((d = (w2 & 0xFFFFFFFFL) - (other & 0xFFFFFFFFL)) == 0L)if ((d = (w3 & 0xFFFFFFFFL) - (other >>> 16 & 0xFFFFFFFFL)) == 0L)if ((d = (w4 & 0xFFFFFFFFL) - (other >>> 8 & 0xFFFFFFFFL)) == 0L)return Long.compare((w5 & 0xFFFFL) - (other >>> 0 & 0xFFFFL));
    elsereturn Long.compare(d, (other >>> 8 & 0xFFFFFFFFL));
    else return Long.compare(d, (other & 0xFFFFFFFFL));
    else return Long.compare(d, (other >>> 32 & 0xFFFFFFFFL));
}
}