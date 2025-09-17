import java.util.*;

public class Translationtranslation_765 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
        StringBuilder path = new StringBuilder();
        path.append("/").append(getFirstPathElement());
        for (QueryText pathElement : getPathElements(1)) {
            String value = escaper.escape(pathElement.getValue(), QueryParser);
            path.append("/\"").append(value).append("\"");
            return path;
        }
}