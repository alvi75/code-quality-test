import java.util.*;

public class Translation765 {
    public String toQueryString(EscapeQuerySyntax escape) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escape.escape(new StringCharSequence(pathelement.getValue()), Locale.US, EscapeQuerySyntaxType.STRING);
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}