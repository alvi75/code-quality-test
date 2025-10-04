import java.util.*;

public class Translation229 {
    public short getGB2312Id(char c) {
    byte[] buffer = GB2312_CHARSET.encode(String.valueOf(c));
    assert buffer.length == 2;
    final int b0 = buffer[0] & 0xFF;
    final int b1 = buffer[1] & 0xFF;
    return (short) (b0 * 94 + b1);
}
}