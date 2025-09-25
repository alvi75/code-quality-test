import java.util.*;

public class Translation765 {
    public String toQueryString(ESCAPEQuerySyntax escaper) {
    StringBuilder path = new StringBuilder();
    path.append("/").append(getFirstPathElement());
    for (int i = 1;
    i < getPathElements().size();
    i++) {
        String pathelement = getPathElements().get(i);
        String value = escaper.escape(pathelement.getValue(), CultureInfo.getInstance());
        path.append("/\"").append(value).append("\"");
    }
    return path.toString();
}
}