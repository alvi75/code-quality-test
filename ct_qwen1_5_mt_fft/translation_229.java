import java.util.*;

public class Translation229 {
    public short getGB2312Id(Character c) throws IOException {
    try {
        String s = Character.toString(c);
        byte[] buffer = Encoding.getEncoder().encode(s.getBytes(StandardCharsets.GB_2312));
        if (buffer.length != 2) {
            return -1;
        }
        int b0 = (buffer[0] & 0x0FF) - 161;
        int b1 = (buffer[1] & 0x0FF) - 161;
        return (short) (b0 * 94 + b1);
    }
    catch (CharacterCodingException e) {
        throw new IOException(e.getMessage(), e);
    }
}
}