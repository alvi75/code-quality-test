import java.util.*;

public class Translation913 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}