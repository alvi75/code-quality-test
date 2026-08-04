import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u, boolean decode) {
        List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>();
        String path = u.getRawPath();
        if (path == null || path.length() == 0) {
            return segments;
        }
        int start = 0;
        int end = path.indexOf('/', start);
        while (end != -1) {
            String segment = path.substring(start, end);
            if (decode) {
                segment = UriComponent.decode(segment, UriComponent.Type.PATH_SEGMENT);
            }
            segments.add(new PathSegmentImpl(segment));
            start = end + 1;
            end = path.indexOf('/', start);
        }
        String segment = path.substring(start);
        if (decode) {
            segment = UriComponent.decode(segment, UriComponent.Type.PATH_SEGMENT);
        }
        segments.add(new PathSegmentImpl(segment));
        return segments;
    }
}