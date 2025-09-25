import java.util.*;

public class Translation913 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}