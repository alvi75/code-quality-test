import java.util.*;

public class Translation913 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.field)) {
        return "\"" + getTermEscaped(escaper) + "\"";
    }
    else {
        return this.field + ":" + "\"" + getTermEscaped(escaper) + "\"";
    }
}
}