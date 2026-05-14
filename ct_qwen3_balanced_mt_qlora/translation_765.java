import java.util.*;

public class Translation765 {
    ublic CharSequence toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append('/').append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()), CultureInfo.InvariantCulture, EscapeQuerySyntaxType.STRING).toString();
        path.append('/').append('"').append(value).append('"');
    }
    return path.toString();
}
}