import java.util.*;

public class Translation913 {
    ublic String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}