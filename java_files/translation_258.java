import java.util.*;

public class Translation258 {
    public String getScheme(URIish uri) {
    String name = uri.getHostName();
    if (name == null)return null;
    for (URIish r : resolved) {
        if (r.matches(uri)) {
            return r.getPath();
        }
    }
    return null;
}
}