import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < inputStream.size()) {
        symbol = inputStream.getText(Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return getClass().getName() + "('" + symbol + "')";
}
}