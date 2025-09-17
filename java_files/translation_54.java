import java.util.*;

public class Translationtranslation_54 {
    public long skip(long n) {
        final long s = Math.min(available(), Math.max(0, n));
        ptr += s;
        return s;
    }
}