import java.util.*;

public class Translation345 {
    public char[] toArray(char[] a) {
    if (a.length == _limit) {
        System.arraycopy(_array, 0, a, 0, _limit);
        return a;
    }
    else {
        return super.toCharArray();
    }
}
}