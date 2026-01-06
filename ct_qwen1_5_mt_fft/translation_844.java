import java.util.*;

public class Translation844 {
    public static final int parseHexInt4( byte digit ) {
    final short r = digits16[ digit ];
    if( r < 0 ) {
        throw new ArrayIndexOutOfBoundsException();
    }
    return r;
}
}