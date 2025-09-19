import java.util.*;

public class Translation54 {
    public long skip(long n) {
    final long s = Math.min(available(), Math.max(0, n));
    ptr += s;
    return s;
}
}