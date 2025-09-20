import java.util.*;

public class Translation345 {
    public int[] toArray( int[] a ) {
    int[] rval = a.length == _limit ? a : new int[ _limit ];
    System.arraycopy(_array, 0, rval, 0, _limit);
    return rval;
}
}