import java.util.*;

public class Translation175 {
    public final void copyRawTo(final byte[] b, final int o) {
    NB.encodeInt32(b, o, w1);
    NB.encodeInt32(b, o + 4, w2);
    NB.encodeInt32(b, o + 8, w3);
    NB.encodeInt32(b, o + 12, w4);
    NB.encodeInt32(b, o + 16, w5);
}
}