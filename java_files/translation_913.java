import java.util.*;

public class Translation913 {
    ublic String ToQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}