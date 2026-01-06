import java.util.*;

public class Translation113 {
    ublic static byte[] toBigEndianUtf16Bytes(char[] chars, int offset, int length) {
    final byte[] result = new byte[length * 2];
    int end = offset + length;
    int resultIndex = 0;
    for (int i = offset;
    i < end;
    ++i) {
        final char ch = chars[i];
        result[resultIndex++] = (byte) (ch >>> 8);
        result[resultIndex++] = (byte) ch;
    }
    return result;
}
}