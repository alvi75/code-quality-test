import java.util.*;

public class Translation913 {
    public String toQueryString(ISyntaxEscaper escaper) {
    if (isDefaultField(m_field)) {
        return getTermEscapeQuoted(escaper);
    }
    else {
        return m_field + ":" + getTermEscapeQuoted(escaper);
    }
}
}