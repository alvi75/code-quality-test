import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**If the match between the url and the pattern occurs, return the match result. Otherwise, return null.**/
    public final MatchResult match(CharSequence uri) {
        if (uri == null) {
            throw new NullPointerException("uri");
        }
        int len = uri.length();
        if (len < pattern.length()) {
            return null;
        }

        int i = 0;
        for (; i < pattern.length(); ++i) {
            char c = pattern.charAt(i);
            if (!isMatch(c)) {
                break;
            }
        }

        if (i == pattern.length()) {
            return new MatchResult(uri, i, len);
        } else {
            return null;
        }
    }
}