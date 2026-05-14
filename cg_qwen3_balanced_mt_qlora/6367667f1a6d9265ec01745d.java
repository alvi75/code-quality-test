import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
	public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>();
		String rawPath = u.getRawPath();
		if(rawPath==null) return segments;
		int start = 0;
		int end = 0;
		while(end<rawPath.length()){
			end = rawPath.indexOf('/',start);
			if(end==-1) end = rawPath.length();
			String segment = rawPath.substring(start,end);
			if(decode) segment = URLDecoder.decode(segment,"UTF-8");
			segments.add(new PathSegmentImpl(segment));
			start = end+1;
		}
		return segments;
	}
}