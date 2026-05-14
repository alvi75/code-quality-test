import java.util.*;

public class Translation913 {
    1 public String toQueryString(EscapeQuerySyntax escapeSyntaxParser) {
    2 if (isDefaultField(m_field)) {
        3 return "\"" + getTermEscapeQuoted(escapeSyntaxParser) + "\"";
        4 }
        else {
            5 return m_field + ":" + "\"" + getTermEscapeQuoted(escapeSyntaxParser) + "\"";
            6 }
        }
}