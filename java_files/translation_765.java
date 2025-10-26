import java.util.*;

public class Translation765 {
    ublic String toQueryString(EscapeQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (QueryText pathelement : getPathElements(1)) {
        String value = escaper.escape(new StringCharSequence(pathelement.getValue()), LocaleUtil.getUserLocale(), EscapeQuerySyntaxType.STRING).toString();
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}