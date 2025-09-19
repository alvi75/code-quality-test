import java.util.*;

public class Translation844 {
    public static int parseHexInt4(final byte digit) {
    final byte r = digits16[digit];
    if (r < 0) {
        throw new ArrayIndexOutOfBoundsException(digit);
    }
    return r;
}
}