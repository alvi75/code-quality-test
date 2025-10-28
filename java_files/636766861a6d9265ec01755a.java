import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri) {
        if (uri == null || uri.length() < patternLength)
            return null;
        
        int i = 0;
        for (; i < patternLength; ++i){
            char c = uri.charAt(i);
            if (c != pattern[i])
                break;
        }
        
        if (i == patternLength)
            return new MatchResult(uri, i, patternLength);
        else
            return null;
    }
}