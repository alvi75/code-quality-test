import java.util.*;

public class Translation34 {
    public static String quote(String in) {
    final StringBuilder r = new StringBuilder();
    r.append('\'');
    int apos = 0;
    int k = in.indexOf('\\');
    while (k >= 0) {
        if (apos < k)r.append(in.substring(apos, k));
        r.append("\\'");
        r.append(k);
        r.append("'");
        apos = k + 1;
        k = in.indexOf('\\');
    }
    r.append(in.substring(apos));
    r.append('\'');
    return r.toString();
}
}