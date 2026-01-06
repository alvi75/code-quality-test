import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < inputStream.getSize()) {
        symbol = inputStream.getText(CharStreams.Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format(Locale.US, "%s('%s')", getClass().getName(), symbol);
}
}