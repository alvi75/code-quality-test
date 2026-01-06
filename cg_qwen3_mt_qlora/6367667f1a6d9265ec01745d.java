import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
		String s=u.getRawPath();
		if(s==null)return null;
		List<PathSegmentImpl> l=new ArrayList<PathSegmentImpl>();
		int i=0;
		while(i<s.length()){
			int j=s.indexOf('/',i);
			if(j<0)j=s.length();
			l.add(new PathSegmentImpl(u,s.substring(i,j),decode));
			i=j+1;
		}
		return l;
	}
}