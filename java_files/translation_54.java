import java.util.*;

public class Translationtranslation_54 {
    public long skip(long n) {
        final int s = (int) Math.min(getAvailable(), Math.max(0, n));
        ptr += s;
        return s;
    }
}