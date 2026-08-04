import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < input.size()) {
        symbol = input.getText(Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format(Locale.getDefault(), "%s('%s')", getClass().getSimpleName(), symbol);
}
}