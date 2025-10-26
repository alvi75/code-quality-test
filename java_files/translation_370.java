import java.util.*;

public class Translation370 {
    public void set(final int index, final long value) {
    final int o = index >>> 5;
    final int b = index & 0x1F;
    final int shift = b << 1;
    blocks[o] = (blocks[o] & ~((long)3 << shift)) | ((long)value << shift);
}
}