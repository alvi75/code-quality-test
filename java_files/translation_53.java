import java.util.*;

public class Translationtranslation_53 {
    public void set(int index, long value) {
        final int o = index >>> 2;
        final int b = index & 3;
        final int shift = b << 4;
        blocks[o] = (blocks[o] & ~(65535L << shift)) | (value << shift);
    }
}