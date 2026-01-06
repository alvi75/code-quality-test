import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>();
		String[] pathSegments = u.getPath().split("/");
		for(String segment:pathSegments){
			if(segment.length()>0)
				segments.add(new PathSegmentImpl(decode?decodeURIComponent(segment):segment));
		}
		return segments;
	}
}