import java.util.*;

public class Translationtranslation_913 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
        if (isDefaultField(this.field)) {
            return "\"" + getTermEscapeQuoted(escaper) + "\"";
        }
        else {
            return this.field + ":" + "\"" + getTermEscapeQuoted(escaper) + "\"";
        }
    }
}