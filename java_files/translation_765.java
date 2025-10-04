import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    if (getFirstPathElement() == null)return "";
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(pathelement.getValue(), QueryParserBase.DEFAULT_ESCAPE_CHAR);
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}