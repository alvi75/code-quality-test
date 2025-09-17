import java.util.*;

public class Translationtranslation_345 {
    public int[] toArray( int[] a ) {
        int[] rval = a.clone();
        System.arraycopy(_array, 0, rval, 0, _limit);
        return rval;
    }
}