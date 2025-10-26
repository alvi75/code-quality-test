import java.util.*;

public class Translation844 {
    public static int parseHexInt4(byte digit) {
    final byte[] digits16 = HexDigits.DIGITS_16;
    int r = digits16[digit] & 0xFF;
    if (r < 0) {
        throw new IndexOutOfBoundsException();
    }
    return r;
}
}