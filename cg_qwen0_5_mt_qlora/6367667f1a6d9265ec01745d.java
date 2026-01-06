import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    /**Decode the raw path.**/
public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        List<PathSegmentImpl> segments = new ArrayList<PathSegmentImpl>();
        String path = u.getPath();
        if (path == null) return segments;
        int i = 0;
        while (i < path.length()){
            char c = path.charAt(i);
            if (c == ':'){
                // Path segment is a colon.
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == '/') {
                // Path segment is a slash.
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == '?') {
                // Path segment is a question mark.
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == '#') {
                // Path segment is a hash (#).
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == '&') {
                // Path segment is a ampersand (&).
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == '(' || c == ')' || c == '*' || c == '?' || c == '#' || c == '&') {
                // Path segment is one of the following characters.
                if (decode && i + 1 >= path.length()) {
                    throw new IllegalArgumentException("Invalid path: " + path);
                }
                i++;
                continue;
            }
            if (c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' ' || c == ' '
}