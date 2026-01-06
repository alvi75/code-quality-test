import java.util.*;

public class Translation370 {
    public void set(int index, long value) {
    int o = (index >>> 5);
    int b = index & 31;
    int shift = b << 1;
    blocks[o] = (blocks[o] & ~(3L << shift)) | (value << shift);
}
}