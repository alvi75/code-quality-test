import java.util.*;

public class Translationtranslation_639 {
    public final long valueFor(long index) {
        final int o = index >>> 3;
        final int b = index & 7;
        final int shift = b << 3;
        return (blocks[o] >>> shift) & 255L;
    }
}