import java.util.*;

public class Translation765 {
    2017-03-08: removed escaping of path elements since they are already escaped by the query parser. public String toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()), CultureInfo.InvariantCulture, EscapeQuerySyntaxType.STRING);
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}