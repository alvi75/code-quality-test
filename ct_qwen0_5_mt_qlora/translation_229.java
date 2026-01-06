import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) {
    try {
        byte[] buffer = new byte[2];
        buffer[0] = (byte)((ch >> 8) & 0xFF);
        buffer[1] = (byte)(ch & 0xFF);
        return (short) ((buffer[0] << 8) | buffer[1]);
    }
    catch (Exception e) {
        throw new Exception(e.getMessage(), e);
    }
}
}