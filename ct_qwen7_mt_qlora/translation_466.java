import java.util.*;

public class Translation466 {
    24 public final byte readUByte() throws IOException {
    checkPosition(1);
    return (byte) (_buf[_readIndex++] & 0xff);
}
}