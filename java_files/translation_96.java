import java.util.*;

public class Translationtranslation_96 {
    public String toString() {
        String symbol = "";
        if (startIndex >= 0 && startIndex < getInputStream().getSize()) {
            symbol = getInputStream().getText(Interval.of(startIndex, startIndex));
            symbol = symbol.replaceAll("\\s+", " ");
        }
        return String.format(Locale.ROOT, "%s(%s)", getClass().getName(), symbol);
    }
}