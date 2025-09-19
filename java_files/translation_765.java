import java.util.*;

public class Translation765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    if (getPathElements().size() == 0)return "";
    StringBuilder sb = new StringBuilder();
    sb.append("/").append(getFirstPathElement());
    for (int i = 1;
    i < getPathElements().size();
    i++) {
        sb.append(" ").append(getPathElements().get(i));
    }
    return sb.toString();
}
}