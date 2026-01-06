import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if(uri==null)throw new IllegalArgumentException("uri can not be null");
		
		int i=0;
		for(;i<matchers.size();i++){
			Matcher matcher = (Matcher)matchers.get(i);
			
			if(matcher.match(uri)==null)
				return null;
		}
		
		return new MatchResult(this,uri);
	}
}