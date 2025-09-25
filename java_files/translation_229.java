import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) throws UnsupportedEncodingException {
    try {
        final byte[] buffer = ch.getBytes("GB2312");
        if (buffer.length != 2)return -1;
        final int b0 = (buffer[0] & 0x0FF) - 161;
        final int b1 = (buffer[1] & 0x0FF) - 161;
        return (short) ((b0 * 94 + b1) / 2);
    }
    catch (UnsupportedEncodingException e) {
        throw new RuntimeException(e.getMessage(), e);
    }
}
}