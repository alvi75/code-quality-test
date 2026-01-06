import java.util.*;

public class Translation765 {
    public String toStringQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement()).append('/');
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()), CultureInfo.getInstance("en-US"), EscapeQuerySyntaxType.STRING);
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}