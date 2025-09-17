import java.util.*;

public class Translationtranslation_96 {
    public String toString() {
        String symbol = null;
        if (startIndex >= 0 && startIndex < getInputStream().size()) {
            symbol = getInputStream().getText(Interval.of(startIndex, startIndex));
            symbol = Utils.escapeWhitespace(symbol, false);
        }
        return String.format("'%s' %s with %d alternatives", symbol, super.toString(), getNumberOfAlts());
    }
}