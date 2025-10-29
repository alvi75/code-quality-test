import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if ( startIndex >= 0 && startIndex < inputStream.size() ) {
        symbol = inputStream.getText( Interval.of(startIndex, startIndex));
        symbol = StringUtils.escapeWhitespace(symbol, false );
    }
    return String.format(Locale.US, "%s('%s')", getClass().getName(), symbol);
}
}