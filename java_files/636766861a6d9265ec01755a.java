import java.util.*;

public class Generated_636766861a6d9265ec01755a {
    public final MatchResult match(CharSequence uri){
		if(uri.length() == 0) {
			return this.uri.length() == 0 ? new MatchResult(0, true) : null;
		}
		
		int index = 0;
		MatchResult mr = new MatchResult();
		for(PatternPart part: this.pattern){
			switch(part.type){
				case TEXT:
					if(index >= uri.length()) return null;
					
					String text = part.toString();
					if(text.length() > 1 && text.charAt(0) == '*'){
						int i = 0;
						while(i < text.length() && text.charAt(i) != '*') i++;
						
						String prefix = text.substring(1, i);
						String suffix = text.substring(i+1);
						
						if(!uri.subSequence(index, uri.length()).toString().startsWith(prefix)) return null;
						index += prefix.length();
						
						mr.prefixes.add(suffix);
						break;
					}else if(!uri.subSequence(index, Math.min(index + text.length(), uri.length())).toString().equals(text)){
						return null;
					}else{
						index += text.length();
					}
					break;
				case REGEX:
					Matcher matcher = part.getMatcher(uri.subSequence(index, Math.min(index + uri.length(), uri.length())));
					if(!matcher.matches()){
						return null;
					}else{
						index += matcher.start();
						mr.matchers.add(matcher);
					}
					break;
			}
		}
		
		return mr;
	}
}