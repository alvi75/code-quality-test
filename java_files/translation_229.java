import java.util.*;

public class Translationtranslation_229 {
    public short getGB2312Id(char ch) {
        try {
            byte[] buffer = new byte[2];
            buffer[1] = (byte) ch;
            int len = decoder.decode(buffer, 0, buffer.length);
            if (len != 2) {
                return -1;
            }
            int b0 = buffer[0] & 0xFF;
            int b1 = buffer[1] & 0xFF;
            return (short) (b0 * 94 + b1);
        }
        catch (IllegalCharsetNameException| UnsupportedCharsetException badName) {
            return -1;
        }
    }
}