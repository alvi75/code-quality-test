import java.util.*;

public class Translationtranslation_229 {
    public short getGB2312Id(Character ch) {
        char[] buffer = {
            ' ', ' ' }
            ;
            Character.toChars(ch, buffer, 0, 2);
            try {
                byte[] b = new byte[2];
                b[0] = (byte) (buffer[0] & 0x0FF);
                b[1] = (byte) (buffer[1] & 0x0FF);
                String gbk = new String(b, "GB2312");
                return (short)gbk.charAt(0);
            }
            catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
}