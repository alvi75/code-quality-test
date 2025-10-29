import java.util.*;

public class Translation345 {
    public int[] toArray() {
    int[] rval;
    if (_limit > _array.length) {
        System.arraycopy(_array, 0, rval = new int[_limit], 0, _limit);
    }
    else {
        rval = toArray();
    }
    return rval;
}
}