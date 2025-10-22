import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        String s=u.getPath();
        if(s==null)return null;
        return decodePath(s,decode);
    }
}