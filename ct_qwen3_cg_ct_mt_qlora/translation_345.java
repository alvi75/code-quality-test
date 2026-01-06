import java.util.*;

public class Translation345 {
    public int[] toArray(int[] a) {
    int[] rval;
    if (a.length == limit) {
        System.arraycopy(array, 0, a, 0, limit);
        rval = a;
    }
    else {
        rval = toArray();
    }
    return rval;
}
}