import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if ( startTokenIndex >= 0 && startTokenIndex < getInputStream().size() ) {
        symbol = getInputStream().getText(Interval.of( startTokenIndex,startTokenIndex ));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format(Locale.ROOT,"%s('%s')",getClass().getSimpleName(), symbol);
}
}