import java.util.*;

public class Translation844 {
    public static int parseHexInt4(byte[] b) {
    final byte[] d = new byte[4];
    System.arraycopy(b, 0, d, 0, 4);
    return (d[0] << 24) | (d[1] << 16) | (d[2] << 8) | d[3];
}
}