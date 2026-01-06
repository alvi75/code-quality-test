import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) throws IOException {
    final byte[] buffer = StandardCharsets.GB_2312.encode(Character.toString(ch));
    if (buffer.length != 2) {
        return -1;
    }
    final int b0 = (buffer[0]&0xFF)-161;
    final int b1 = (buffer[1]&0xFF)-161;
    return (short)(b0*94+b1);
}
}