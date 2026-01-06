import java.util.*;

public class Translation175 {
    public void copyRawTo(byte[] b, int o) {
    b[o] = (byte) (w1 & 0xFF);
    b[o+1] = (byte) ((w1 >>> 8) & 0xFF);
    b[o+2] = (byte) (w2 & 0xFF);
    b[o+3] = (byte) ((w2 >>> 8) & 0xFF);
    b[o+4] = (byte) (w3 & 0xFF);
    b[o+5] = (byte) ((w3 >>> 8) & 0xFF);
    b[o+6] = (byte) (w4 & 0xFF);
    b[o+7] = (byte) ((w4 >>> 8) & 0xFF);
    b[o+8] = (byte) (w5 & 0xFF);
    b[o+9] = (byte) ((w5 >>> 8) & 0xFF);
}
}