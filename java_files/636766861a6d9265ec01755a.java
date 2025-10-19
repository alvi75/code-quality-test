import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if(uri==null)return null;
		
		Matcher matcher=this.pattern.matcher(uri);
		return matcher.find()?matcher.toMatchResult():null;
	}
}