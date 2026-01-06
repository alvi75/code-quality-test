import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) throws IOException {
    byte[] buffer = Encoding.getEncoding("GB2312").getBytes(ch.toString());
    if (buffer.length != 2)return -1;
    int b0 = (buffer[0] & 0x0FF) - 161;
    int b1 = (buffer[1] & 0x0FF) - 161;
    return (short)(b0 * 94 + b1);
}
}