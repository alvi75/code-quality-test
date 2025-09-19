import java.util.*;

public class Translation345 {
    public int[] toArray(int[] a) {
    if (a.length == _limit) {
        System.arraycopy(_array, 0, a, 0, _limit);
        return a;
    }
    else {
        return toIntegerList().toArray(a);
    }
}
}