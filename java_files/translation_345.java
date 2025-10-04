import java.util.*;

public class Translation345 {
    public int[] toArray(final int[] a) {
    if (a.length == _limit) {
        System.arraycopy(_array, 0, a, 0, _limit);
        return a;
    }
    else {
        return toArray(new int[ _limit ]);
    }
}
}