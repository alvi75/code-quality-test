import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) {
    try {
        byte[] buffer = StandardCharsets.getDecoder("GB2312").decode(ch.toString()).toByteArray();
        if (buffer.length != 2) {
            return -1;
        }
        int b0 = (buffer[0] & 0xFF) - 161;
        int b1 = (buffer[1] & 0xFF) - 161;
        return (short)(b0 * 94 + b1);
    }
    catch (IllegalArgumentException e) {
        throw new RuntimeException(e);
    }
}
}