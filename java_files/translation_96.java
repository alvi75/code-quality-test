import java.util.*;

public class Translation96 {
    ublic String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < ((ICharStream)inputStream).size()) {
        symbol = inputStream.getText(Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format(Locale.ENGLISH, "%s('%s')", getClass().getName(), symbol);
}
}