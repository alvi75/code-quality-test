import java.util.*;

public class Translation54 {
    1 public long skip(long n) {
    2 int s = (int) Math.min(available(), Math.max(0, n));
    3 ptr += s;
    4 return s;
}
}