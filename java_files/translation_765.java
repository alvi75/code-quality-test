import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement()).append('/');
    appendPathElements(path, get PathElements(), escaper);
    return path;
}
}