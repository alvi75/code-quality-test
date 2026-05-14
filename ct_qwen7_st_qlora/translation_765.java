import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    final StringBuilder sb = new StringBuilder();
    sb.append('/').append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(pathelement.getValue()).toString();
        sb.append("/\"").append(value).append("\"");
    }
    return sb;
}
}