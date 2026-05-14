import java.util.*;

public class Translation913 {
    ublic String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(field)) {
        return "\"" + getTermEscaped(escaper) + "\"";
    }
    else {
        return field + ":" + "\"" + getTermEscaped(escaper) + "\"";
    }
}
}