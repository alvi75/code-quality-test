import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
        if(uri == null) return null;
        int i = 0;
        int j = 0;
        while(i < this.pattern.length() && j < uri.length()){
            char c1 = this.pattern.charAt(i);
            char c2 = uri.charAt(j);
            if(c1 == c2){
                i++;
                j++;
            }else{
                break;
            }
        }
        if(i == this.pattern.length()) return new MatchResult(this.pattern,uri.substring(j));
        else return null;
    }
}