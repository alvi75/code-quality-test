import java.util.*;

public class Translation370 {
    public void set(int index, long value) {
    final int o = (index >>> 5) & 0x1f;
    final int b = index & 31;
    final int shift = b << 1;
    blocks[o] = (blocks[o] & ~(3L << shift)) | (value << shift);
}
}