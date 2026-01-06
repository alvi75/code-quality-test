import java.util.*;

public class Translation96 {
    ublic String toString() {
    String symbol = "";
    if ( startIndex >= 0 && startIndex < ((CharStream)input).size() ) {
        symbol = ((CharStream)input).getText(new Interval(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format("%s('%s')", getClass().getName(), symbol);
}
}