import java.util.*;

public class Translation548 {
    public final void set(int index, long value) {
    final int o = index >>> 6;
    final int b = index & 63;
    final int shift = b << 0;
    blocks[o] = (blocks[o] & ~(1L << shift)) | (value << shift);
}
}