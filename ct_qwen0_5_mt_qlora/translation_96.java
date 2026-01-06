import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < getInputStream().size()) {
        symbol = getInputStream().getText(getInputStream().getStart(), getInputStream().getEnd());
        symbol = Utils.escapeWhitespace(symbol, false);
    }
    return String.format("%s('{
        1}
        ')", getClass().getName(), symbol);
    }
}