import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = pathelement.getValue();
        path.append("/\"").append(escaper.escape(value)).append("\"");
    }
    return path;
}
}