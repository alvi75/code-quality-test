import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		List<PathSegmentImpl> segments = new ArrayList<>();
		String[] parts = StringUtils.split(u.getPath(), "/");
		for (String part : parts) {
			if(decode)
				segments.add(new PathSegmentImpl(UriUtils.decode(part)));
			else
				segments.add(new PathSegmentImpl(part));
		}
		return segments;
	}
}