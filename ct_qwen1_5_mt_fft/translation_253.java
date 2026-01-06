import java.util.*;

public class Translation253 {
    public int readUShort() {
    byte[] buf = new byte[2];
    try {
        checkEOF(read(buf), buf.length);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    return ((buf[0] & 0xff) << 8) | (buf[1] & 0xff);
}
}