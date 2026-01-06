import java.util.*;

public class Translation54 {
    public long skip(long n) {
    int s = (int)Math.min(avail(), n);
    ptr += s;
    return s;
}
}