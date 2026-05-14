import java.util.*;

public class Translation54 {
    public long skip(final long n) {
    final int s = (int) Math.min(available(),Math.max(0,n));
    ptr += s;
    return s;
}
}