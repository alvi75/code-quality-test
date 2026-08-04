import java.util.*;

public class Translation844 {
    public static int parseHexInt4(byte digit) {
    final int r = digits16[digit & 0xff];
    if (r < 0) {
        throw new ArrayIndexOutOfBoundsException();
    }
    return r;
}
}