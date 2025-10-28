import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        if(u==null)return null;
        String p=u.getPath();
        if(p==null)return null;
        return decodePath(p,decode);
    }
}