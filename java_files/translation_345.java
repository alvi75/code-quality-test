import java.util.*;

public class Translation345 {
    public int [] toArray(int[] a) {
    if (a.length < _limit) {
        return toArray();
    }
    else {
        System.arraycopy(_array, 0, a, 0, _limit);
        return a;
    }
}
}