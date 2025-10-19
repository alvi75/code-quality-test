import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**
 * Decode the raw path.
**/
public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
    String s=u.getRawPath();
    if(s==null) return null;
    if(decode) s=decode(s);
    return PathSegmentImpl.decodePath(s);
  }
}