import java.util.*;

public class Translation913 {
    1 public String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return this.field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}