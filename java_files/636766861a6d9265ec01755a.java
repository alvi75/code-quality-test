import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null || uri.length() == 0)
            return null;
        int len = uri.length();
        int[] pos = new int[1];
        pos[0] = 0;
        return match(uri, pos);
    }
}