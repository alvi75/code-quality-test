import java.util.*;

public class Translationtranslation_113 {
    public static byte[] toBigEndianUtf16Bytes(char[] chars, int offset, int length) {
        byte[] result = new byte[length * 2];
        int end = offset + length;
        int resultIndex = 0;
        for(int i=offset;
        i<end;
        i++) {
            char ch = chars[i];
            result[resultIndex++] = (byte) (ch >>> 8);
            result[resultIndex++] = (byte) ch;
        }
        return result;
    }
}