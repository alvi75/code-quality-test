import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder sb = new StringBuilder();
    sb.append('/').append(getFirstPathElement()).append('/');
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()),EscapeQuerySyntaxType.STRING);
        sb.append('\"').append(value).append('\"');
    }
    return sb.toString();
}
}