import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null)
            throw new NullPointerException("uri");
        int pos = 0;
        int end = uri.length();
        while (pos < end) {
            int start = pos;
            int i = 0;
            while (i < patterns.length && !patterns[i].match(uri, pos)) {
                ++i;
            }
            if (i < patterns.length) {
                MatchResult mr = patterns[i].match(uri, pos);
                if (mr != null) {
                    return mr;
                }
            }
            ++pos;
        }
        return null;
    }
}