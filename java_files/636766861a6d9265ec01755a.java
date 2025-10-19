import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**If the match between the url and the pattern occurs, return the match result. Otherwise, return null.*/
    public final MatchResult match(CharSequence uri) {
        if (uri == null)
            throw new IllegalArgumentException("URI is null");
        
        int i = 0;
        for (; i < _pattern.length(); ++i){
            char c = _pattern.charAt(i);
            
            switch(c){
                case '*':
                    //match a sequence of characters
                    break;
                    
                case '?':
                    //match any single character
                    break;
                
                default:
                    //match exactly this character
                    if (_pattern.charAt(i) != uri.charAt(i))
                        return null;
            }
        }

        return new MatchResult(this, uri);
    }
}