import java.util.*;

public class Translation345 {
    public final int[] toArray() {
    if (_limit > Integer.MAX_VALUE) {
        throw new OutOfMemoryError("Required array size too large");
    }
    int[] rval;
    if (_limit <= Integer.MAX_VALUE &&_array.length >= _limit) {
        System.arraycopy(_array, 0, rval = new int[_limit], 0, _limit);
    }
    else {
        rval = new int[ArrayUtil.oversize(_limit, Integer.BYTES)];
        System.arraycopy(_array, 0, rval, 0, _limit);
    }
    return rval;
}
}