import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		if(u==null) return null;
		String s=u.getRawPath();
		if(s==null || s.length()==0) return Collections.emptyList();
		List<PathSegmentImpl> segments=new ArrayList<>();
		int i=0;
		while(i<s.length()){
			char c=s.charAt(i);
			if(c=='\\'){
				i++;
				if(i>=s.length()) continue;
				c=s.charAt(i);
				if(c=='\\') segments.add(new PathSegmentImpl(c));
				else if(c=='/'){
					segments.add(new PathSegmentImpl(PathSegmentImpl.SEPARATOR));
					i++;
				}
				else{
					segments.add(new PathSegmentImpl(c));
					i++;
				}
			}
			else if(decode){
				segments.add(new PathSegmentImpl(c));
				i++;
			}
			else{
				segments.add(new PathSegmentImpl(c));
			}
		}
		return segments;
	}
}