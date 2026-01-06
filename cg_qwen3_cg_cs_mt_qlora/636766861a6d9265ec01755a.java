import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
        if(uri == null) return null;
        int len = uri.length();
        if(len < pattern.length()) return null;
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(c == '*'){
                if(i+1 >= len) return new MatchResult(uri, 0, len);
                else{
                    int j = i+1;
                    while(j<len && uri.charAt(j) != '/'){
                        j++;
                    }
                    if(j==len) return new MatchResult(uri, 0, len);
                    else return new MatchResult(uri, 0, j);
                }
            }else if(c == '?'){
                if(i+1 >= len) return null;
                else{
                    if(uri.charAt(i) == '/') return null;
                    else return new MatchResult(uri, i, i+1);
                }
            }else if(c == '{'){
                int start = i;
                i++;
                while(i<len && uri.charAt(i) != '}') i++;
                if(i>=len || uri.charAt(i) != '}') return null;
                String name = uri.subSequence(start+1, i).toString();
                if(name.isEmpty()) return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '=') return null;
                i++;
                if(i>=len) return null;
                int end = i;
                while(i<len && uri.charAt(i) != '/') i++;
                if(i>=len) return null;
                String value = uri.subSequence(end, i).toString();
                if(value.isEmpty()) return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '/') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '}') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '/') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '}') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '/') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '}') return null;
                i++;
                if(i>=len) return null;
                if(uri.charAt(i) != '/') return null;
                i++;
}