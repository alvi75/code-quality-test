import java.util.*;

public class Translation39 {
    1 public CharSequence toQueryString(EscapeQuerySyntax escapeSyntaxParser) {
    return "(" + getChildren().stream().map(c -> c.toQueryString(escapeSyntaxParser)).collect(Collectors.joining(" AND ")) + ")";
}
2
}