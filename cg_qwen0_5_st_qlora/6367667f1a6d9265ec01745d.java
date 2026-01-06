import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		List<PathSegmentImpl> list = new ArrayList<PathSegmentImpl>();
		if(u==null) return list;
		String[] parts = u.getPath().split("/");
		for(int i=0;i<parts.length;i++){
			list.add(new PathSegmentImpl(parts[i],decode));
		}
		return list;
	}
}