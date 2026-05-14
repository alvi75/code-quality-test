import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    /**If the match between the url and the pattern occurs, return the match result. Otherwise, return null.*/
public final MatchResult match(CharSequence uri){
		if (uri == null) throw new NullPointerException("The parameter 'uri' should not be null");
		
		int length = uri.length();
		if(length < 1 || length > MAX_URI_LENGTH)
			return null;
		
		//check if the uri starts with a slash
		boolean startsWithSlash = uri.charAt(0) == '/';
		
		//check if the uri ends with a slash
		boolean endsWithSlash = uri.charAt(length - 1) == '/';
		
		//check if the uri is empty or only contains slashes
		boolean isEmptyOrOnlySlashes = length == 0 || (length == 1 && startsWithSlash);
		
		//check if the uri has any query parameters
		boolean hasQueryParameters = uri.indexOf('?') != -1;
		
		//check if the uri has any fragments
		boolean hasFragments = uri.indexOf('#') != -1;
		
		//check if the uri has any special characters
		boolean hasSpecialCharacters = false;
		for(int i=0; i<length; i++){
			char c = uri.charAt(i);
			
			if(c == '?' || c == '#' || c == '/' || c == '.' || c == ';' || c == '&')
				continue;
			
			hasSpecialCharacters = true;
			break;
		}
		
		//if the uri does not contain any special characters, then it can be cached
		if(!hasSpecialCharacters){
			MatchResult cachedResult = cache.get(uri.toString());
			if(cachedResult != null)
				return cachedResult;
		}
		
		//check if the uri matches the pattern
		Matcher matcher = pattern.matcher(uri);
		if(matcher.matches()){
			//create the match result
			MatchResult result = new MatchResult(
					matcher.groupCount(),
					startsWithSlash,
					endsWithSlash,
					isEmptyOrOnlySlashes,
					hasQueryParameters,
					hasFragments,
					matcher.group()
			);
			
			//cache the result
			cache.put(uri.toString(), result);
			
			return result;
		}
		
		return null;
	}
}