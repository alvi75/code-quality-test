import java.util.*;

public class Translation229 {
    public final short getGB2312Id(char ch) {
    try {
        final byte[] buffer = Charset.forName("GB2312").encode(String.valueOf(ch)).array();
        if (buffer.length != 2) {
            return -1;
        }
        final int b0 = (buffer[0] & 0xFF) - 161;
        final int b1 = (buffer[1] & 0xFF) - 161;
        return (short)((b0 << 6) | b1);
    }
    catch (UnsupportedEncodingException e) {
        throw new RuntimeException(e.toString(), e);
    }
}
}