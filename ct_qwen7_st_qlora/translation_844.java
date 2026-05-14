import java.util.*;

public class Translation844 {
    public static final int parseHexInt4(final byte digit) throws ArrayIndexOutOfBoundsException {
    final sbyte r = Hex.digits16[digit];
    if (r < 0) {
        throw new ArrayIndexOutOfBoundsException();
    }
    return r;
}
}