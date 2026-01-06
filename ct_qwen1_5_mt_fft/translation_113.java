import java.util.*;

public class Translation113 {
    public static final byte[] toBigEndianUtf16Bytes( char[] chars, int offset, int length ) {
    byte[] result = new byte[length << 1];
    int end = offset + length;
    for (int i = offset;
    i < end;
    ++i) {
        char ch = chars[i];
        result[(i << 1) + 1] = (byte) ch;
        result[(i << 1)] = (byte) ((ch >>> 8) & 0xFF);
    }
    return result;
}
}