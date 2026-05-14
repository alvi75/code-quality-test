import java.util.*;

public class Translation113 {
    public static byte[] toBigEndianUTF16Bytes(char[] s, int off, int len) {
    final byte[] r = new byte[len * 2];
    for(int i=off,j=0;
    i<end;
    ++i) {
        char ch = s[i];
        r[j++] = (byte)((ch >>> 8) & 0xFF);
        r[j++] = (byte)(ch & 0xFF);
    }
    return r;
}
}