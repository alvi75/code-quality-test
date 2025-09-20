import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    if (getFirstPathElement() != null) {
        path.append(getFirstPathElement().toQueryString(escaper));
    }
    path.append("/");
    for (int i = 1;
    i < getPathElements().length;
    i++) {
        path.append(getPathElements(i).toQueryString(escaper));
    }
    return path.toString();
}
}