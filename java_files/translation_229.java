import java.util.*;

public class Translation229 {
    ublic short getGB2312Id(char ch) {
    try {
        byte[] buffer = gb2312Encoder.encode(CharBuffer.wrap(new char[] {
            ch }
            ));
            if (buffer.length != 2) {
                return -1;
            }
            int b0 = buffer[0] & 0xFF;
            int b1 = buffer[1] & 0xFF;
            return (short) (b0 * 94 + b1);
        }
        catch (CharacterCodingException e) {
            return -1;
        }
    }
}