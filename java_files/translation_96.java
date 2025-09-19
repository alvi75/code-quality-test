import java.util.*;

public class Translation96 {
    ublic String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < getInputStream().size()) {
        symbol = getInputStream().getText(Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return getClass().getName() + "(" + symbol + ")";
}
}