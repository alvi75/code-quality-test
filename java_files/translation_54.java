import java.util.*;

public class Translation54 {
    public long skip(long n) {
    int s = (int)Math.min(avail(), Math.max(0, n));
    ptr += s;
    return s;
}
}