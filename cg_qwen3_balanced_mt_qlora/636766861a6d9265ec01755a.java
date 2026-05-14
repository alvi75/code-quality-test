import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**If the match between the url and the pattern occurs, return the match result. Otherwise, return null.**/
    public final MatchResult match(CharSequence uri) {
        if (uri == null || uri.length() == 0)
            return null;
        int pos = 0;
        for (int i = 0; i < this.patterns.length; i++) {
            Pattern p = this.patterns[i];
            if (p != null) {
                Matcher m = p.matcher(uri);
                if (!m.matches())
                    return null;
                String[] groups = m.groupCount() > 0 ? m.groupCount() >= 2 ? new String[m.groupCount()-1] : new String[1] : new String[0];
                for (int j = 0; j < groups.length; j++)
                    groups[j] = m.group(j+1);
                return new MatchResult(pos, m.end(), groups);
            }
            pos += this.patterns[i].pattern().length();
        }
        return null;
    }
}