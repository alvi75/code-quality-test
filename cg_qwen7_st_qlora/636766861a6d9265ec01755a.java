import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if(uri == null || uri.length() < 1) {
			return null;
		}
		
		int index = uri.indexOf('?');
		String path = (index > -1 ? uri.subSequence(0, index).toString():uri.toString());
		String query = (index > -1 ? uri.subSequence(index+1, uri.length()).toString():null);
		
		return match(path,query);
	}
}