import java.util.*;

public class Translation765 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append('/').append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharacterIterator(pathelement.value()), "UTF-8", escapeQuerySyntaxType.STRING);
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}