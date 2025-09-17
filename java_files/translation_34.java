import java.util.*;

public class Translationtranslation_34 {
    public static String quote(String in) {
        final StringBuilder r = new StringBuilder();
        r.append('\'');
        int apos = 0;
        int k = in.indexOf('\\', apos);
        while (k >= 0) {
            r.append(in.substring(apos, k));
            r.append('\\');
            apos = k + 1;
            k = in.indexOf('\\', apos);
        }
        r.append(in.substring(apos));
        r.append('\'');
        return r.toString();
    }
}