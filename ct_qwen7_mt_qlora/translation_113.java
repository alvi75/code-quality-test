import java.util.*;

public class Translation113 {
    1 public static byte[] toBigEndianUtf16Bytes(final char[] chars, final int offset, final int length) {
    2 final byte[] result = new byte[length * 2];
    3 final int end = offset + length;
    4 int resultIndex = 0;
    5 for (int i = offset;
    i < end;
    ++i) {
        6 final char ch = chars[i];
        7 result[resultIndex++] = (byte) (ch >> 8);
        8 result[resultIndex++] = (byte) ch;
        9 }
        10 return result;
    }
}