import java.util.*;

public class Translation253 {
    public final int readUShort() {
    byte[] buf = new byte[2];
    readFully(buf, 0, buf.length);
    return LittleEndian.getUShort(buf);
}
}