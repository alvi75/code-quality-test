import java.util.*;

public class Translation913 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(field)) {
        return quote(getTermEscaped(escaper));
    }
    else {
        return field+":"+quote(getTermEscaped(escaper));
    }
}
}