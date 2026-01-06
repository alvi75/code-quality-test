import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.
@see #decodePath(String, boolean)
@since 1.2
*/ public static List<PathSegmentImpl> decodePath(URI u,boolean decode) {
        return decodePath(u.getRawPath(),u.isOpaque(),decode);
    }
}