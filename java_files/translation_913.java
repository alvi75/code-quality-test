import java.util.*;

public class Translation913 {
    ublic String toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(m_field)) {
        return "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
    else {
        return m_field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
    }
}
}