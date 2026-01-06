import java.util.*;

public class Translation96 {
    ublic String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < inputStream.size()) {
        symbol = inputStream.getText(Interval.of(startIndex, startIndex));
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format("%s('%s')", Antlr4Runtime.LexerNoViableAltException.class.getName(), symbol);
}
}