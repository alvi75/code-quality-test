import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        String p = u.getRawPath();
        if(p==null)return Collections.emptyList();

        // Decode the path.
        if(decode) {
            try {
                return PathSegments.decode(p);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid URI: "+u,e);
            }
        }

        // Return the decoded path as is.
        return Arrays.asList(PathSegments.split(p));
    }
}