import java.util.*;

public class Translation913 {
    public CharSequence toQueryString(EscapeQuerySyntax escaper) {
    if (isDefaultField(this.field)) {
        return getTermEscaped();
    }
    else {
        return this.field + ":" + getTermEscaped();
    }
}
}