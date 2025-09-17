import java.util.*;

public class Translationtranslation_913 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
        if (isDefaultField(this.field)) {
            return getTermEscaped(escaper);
        }
    }
    else {
        return this.field + ":" + getTermEscaped(escaper);
    }
    }
}