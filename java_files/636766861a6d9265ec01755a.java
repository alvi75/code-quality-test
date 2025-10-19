import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null) {
            throw new NullPointerException("uri");
        }
        int len = uri.length();
        if (len < min || len > max) {
            return null;
        }
        char[] chars = new char[len];
        uri.getChars(0, len, chars, 0);
        return match(chars, 0);
    }
}