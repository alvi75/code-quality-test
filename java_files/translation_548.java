import java.util.*;

public class Translationtranslation_548 {
    public void set(int index, long value) {
        final int o = index >>> 6;
        final int b = index & 63;
        final int shift = b << 12;
        blocks[o] = (blocks[o] & ~(4095L << shift)) | (value << shift);
    }
}