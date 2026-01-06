import java.util.*;

public class Translation96 {
    2 public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < inputStream.size()) {
        symbol = inputStream.getText(new Interval(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format("%s('%s')", getClass().getName(), symbol);
}
}