import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        String s = u.getRawPath();
        if(s==null) return null;
        int n = s.length();
        if(n==0) return Collections.emptyList();

        // Find out how many segments there are in this path.
        int segc=1;  // at least one segment
        for(int i=0;i<n;++i)
            if(s.charAt(i)=='/')
                ++segc;

        PathSegmentImpl[] segs = new PathSegmentImpl[segc];
        int segi=0;
        int start=0;
        for(int i=0;i<n;++i){
            char c = s.charAt(i);
            if(c=='/'){
                String seg = s.substring(start,i);
                segs[segi++] = new PathSegmentImpl(seg,decode?URLDecoder.decode(seg):seg);
                start=i+1;
            }
        }

        // Add last segment
        String seg = s.substring(start,n);
        segs[segi] = new PathSegmentImpl(seg,decode?URLDecoder.decode(seg):seg);

        return Arrays.asList(segs);
    }
}