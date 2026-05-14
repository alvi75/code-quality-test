import java.util.*;

public class Translation844 {
    public static final int parseHexInt4(byte digit) {
    final byte d = digits16[digit];
    if (d >= 0)return d;
    if (digit == -1 || digit == -2)return -1;
    throw new ArrayIndexOutOfBoundsException();
}
}