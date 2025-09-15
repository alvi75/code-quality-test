import java.util.*;

public class Translationtranslation_634 {
    public static TagOpt fromString(String str) {
        if (str.isEmpty())return AUTO_FOLLOW;
        final char first = str.charAt(0);
        final TagOpt opt = TAGOPTS.get(first);
        if (opt == null)throw new IllegalArgumentException("Unknown option " + str);
        return opt;
    }
}