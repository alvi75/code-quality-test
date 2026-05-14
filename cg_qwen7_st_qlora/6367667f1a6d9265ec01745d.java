import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		String s = u.getPath();
		if(s==null) return null;
		List<String> list = split(s,'/');
		int size = list.size();
		PathSegmentImpl[] segments = new PathSegmentImpl[size];
		for(int i=0;i<size;i++){
			String v = list.get(i);
			if(decode){
				v = URLDecoder.decode(v,"UTF-8");
			}
			segments[i] = new PathSegmentImpl(v,i==size-1);
		}
		return Arrays.asList(segments);
	}
}