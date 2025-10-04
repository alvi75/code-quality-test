import java.util.*;

public class Translation844 {
    public static int parseHexInt4(final byte[] b, int ptr) {
    final int sz = b.length;
    if (ptr == 0)ptr += 48;
    while (ptr < sz && b[ptr] == ' ')ptr++;
    try {
        if (b[ptr] == '\'') {
            ptr += 2;
        }
        else if (b[ptr] == ':')ptr += 3;
    }
    catch (ArrayIndexOutOfBoundsException e) {
        throw new ArrayIndexOutOfBoundsException("truncated");
    }
    return hexToInt(b, ptr);
}
}