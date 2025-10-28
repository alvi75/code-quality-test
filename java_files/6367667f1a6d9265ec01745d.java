import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		List<PathSegmentImpl> list = new ArrayList<PathSegmentImpl>();
		String[] parts = u.getPath().split("/");
		for (int i=0;i<parts.length;i++){
			if (decode && !parts[i].equals("."))
				list.add(new PathSegmentImpl(parts[i]));
		}
		return list;
	}
}