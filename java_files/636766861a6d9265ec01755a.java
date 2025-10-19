import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if (uri == null) {
			return new MatchResult(null);
		}
		
		Matcher matcher = pattern.matcher(uri.toString());
		if (matcher.find()) {
			return new MatchResult(matcher.group(0));
		} else {
			return null;
		}
	}
}