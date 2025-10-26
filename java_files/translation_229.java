import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) {
    try {
        byte[] buffer = Charset.forName("gbk").newEncoder().encode(CharBuffer.wrap(new String() {
            char c = ch ;
        }
        . toString())).array();
        if (buffer.length != 2) {
            return -1 ;
        }
        int b0 = (buffer[0] & 0xFF) - 161;
        int b1 = (buffer[1] & 0xFF) - 161;
        return (short) ((b0 << 6) | b1 ) ;
    }
    catch (UnsupportedEncodingException e) {
        throw new RuntimeException(e.toString(), e);
    }
}
}