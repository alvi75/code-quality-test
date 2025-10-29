import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) throws UnsupportedEncodingException {
    byte[] buffer = new byte[2];
    buffer[0] = (byte) (ch >> 8);
    buffer[1] = (byte) (ch & 0xFF);
    return (short) ((buffer[0] << 8) | buffer[1]);
}
}