import java.util.*;

public class Translation548 {
    public void set(int index, long value) {
    final int o = (index >>> 6) & 0x3f;
    final int b = index & 0x3f;
    final int shift = b << 0;
    blocks[o] = (blocks[o] & ~(1L << shift)) | (value << shift);
}
}