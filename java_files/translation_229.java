import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) {
    try {
        byte[] buffer = Charset.forName("GB2312").encode(CharBuffer.wrap(String.valueOf(ch))).array();
        if (buffer.length != 2) {
            return -1;
        }
        int b0 = (buffer[0] & 0x0FF) - 161;
        int b1 = (buffer[1] & 0x0FF) - 161;
        return (short)(b0 * 94 + b1);
    }
    catch (CharacterCodingException e) {
        throw new RuntimeException(e);
    }
}
}