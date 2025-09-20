import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escape) {
    final StringBuilder path = new StringBuilder();
    path.append('/').append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escape.escape(new StringCharSequence(pathelement.value), Locale.ROOT, ESCAPE_TYPE);
        path.append('/').append('\"').append(value).append('\"');
    }
    return path.toString();
}
}