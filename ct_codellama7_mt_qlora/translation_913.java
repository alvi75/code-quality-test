import java.util.*;

public class Translation913 {
    public String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.m_field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return this.m_field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}