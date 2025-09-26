import java.util.*;

public class Translation229 {
    1 public short getGB2312Id(char ch) {
    try {
        byte[] buffer = encoding.getEncoding("GB2312").getBytes(ch.toString());
        if (buffer.length != 2) {
            return -1;
        }
        int b0 = (buffer[0] & 0x0FF) - 161;
        int b1 = (buffer[1] & 0x0FF) - 161;
        return (short)(b0 * 94 + b1);
    }
    catch (ArgumentException e) {
        throw new RuntimeException(e.toString(), e);
    }
}
}