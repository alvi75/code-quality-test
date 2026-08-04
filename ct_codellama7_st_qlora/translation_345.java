import java.util.*;

public class Translation345 {
    public int[] toArray(int[] a) {
    int[] rval;
    if (a.length == _limit) {
        System.arraycopy(_array, 0, a, 0, _limit);
        rval = a;
    }
    else {
        rval = toArray();
    }
    return rval;
}
}