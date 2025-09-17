import java.util.*;

public class Translationtranslation_34 {
    public static String quote(String in) {
        final StringBuilder r = new StringBuilder();
        r.append('\\');
        r.append(in.charAt(0));
        r.append('\'');
        for (int i = 1;
        i < in.length();
        i++) {
            r.append('\\');
            r.append(in.charAt(i));
        }
        r.append('\'');
        return r.toString();
    }
}