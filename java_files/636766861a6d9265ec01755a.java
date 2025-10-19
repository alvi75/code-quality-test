import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**
 * If the match between the url and the pattern occurs, return the match result. Otherwise, return null.
 */
public final MatchResult match(CharSequence uri) {
        if (uri == null || uri.length() == 0) {
            return null;
        }
        int i = 0;
        for (; i < this.pattern.length(); i++) {
            char c = this.pattern.charAt(i);
            if (c == ':') {
                break;
            } else if (c != uri.charAt(i)) {
                return null;
            }
        }

        // The first character of the pattern is not a colon.
        if (i == 1) {
            return new MatchResult(uri, this.pattern, this.pattern.length(), 0, 0);
        }

        // The first character of the pattern is a colon.
        int j = i + 1;
        while (j < this.pattern.length()) {
            char c = this.pattern.charAt(j);
            if (c == '/') {
                break;
            } else if (c != uri.charAt(i)) {
                return null;
            }
            i++;
            j++;
        }

        return new MatchResult(uri, this.pattern, this.pattern.length(), i, j - i);
    }
}