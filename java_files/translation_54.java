import java.util.*;

public class Translation54 {
    public long skip(long n) {
    long s = (int) Math.min(available(), n);
    ptr += s;
    return s;
}
}