import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		String[] segments = u.getRawPath().split("/");
		List<PathSegmentImpl> list = new ArrayList<PathSegmentImpl>(segments.length);
		for (String s : segments) {
			if(s!=null && s.length()>0)
				list.add(new PathSegmentImpl(decode ? URLDecoder.decode(s,"UTF-8") : s));
		}
		return list;
	}
}