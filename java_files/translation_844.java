import java.util.*;

public class Translation844 {
    public static int parseHexInt4(byte digit) {
    int r = digits16[digit & 0xFF];
    if (r < 0) {
        throw new IllegalArgumentException("Invalid hex digit");
    }
    return r;
}
}