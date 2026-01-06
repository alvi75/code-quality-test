import java.util.*;

public class Translation765 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()), CultureInfo.getInstance(), ESCAPE_QUERY_SYNTAX_TYPE_STRING).toString();
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}