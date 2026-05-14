import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u, boolean decode) {
        String raw = u.getRawPath();
        if (raw == null)
            return Collections.emptyList();

        // remove leading slash for root-relative paths
        if (raw.startsWith("/"))
            raw = raw.substring(1);

        ArrayList<PathSegmentImpl> result = new ArrayList<>();
        int length = raw.length();
        StringBuilder sb = new StringBuilder(length);
        char[] array = raw.toCharArray();
        PathSegmentImpl current = null;
        for(int i=0; i<length; ++i){
            char c = array[i];
            switch(c){
                case '/':
                    addSegment(result,decode,sb,current);
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }

        addSegment(result,decode,sb,current);
        return result;
    }
}