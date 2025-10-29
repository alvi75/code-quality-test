import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        if(u.getPath().length()==0) return Collections.emptyList();
        List<PathSegmentImpl> segments = new ArrayList<>();
        int i=0;
        while(i<segments.size()){
            PathSegmentImpl segment = segments.get(i++);
            if(segment.isAbsolute() && !decode)
                continue;
            String s = segment.toString();
            if(s.length()>0){
                if(s.charAt(0)=='!') {
                    //this is a relative path, so we need to decode it
                    s = decodePath(s);
                }
                segments.add(new PathSegmentImpl(s));
            }
        }
        return segments;
    }
}