import java.util.*;

public class Translationtranslation_96 {
    public String toString() {
        String symbol = getSymbol().toString();
        if (startIndex >= 0 && startIndex < size()) {
            symbol = symbol.replaceFirst("^","\\^");
            symbol = symbol.replaceFirst("$","\\$");
            symbol = symbol.replaceFirst("*","\\*");
            symbol = symbol.replaceFirst("?", "\\?");
            symbol = symbol.replaceFirst("+","\\+");
            symbol = symbol.replaceFirst("{
                ","{
                    ");
                    symbol = symbol.replaceFirst("}
                    ", "}
                    ");
                    symbol = symbol.replaceFirst("[","[");
                    symbol = symbol.replaceFirst("]", "]");
                    symbol = symbol.replaceFirst("\\n","\\n");
                    symbol = symbol.replaceFirst("\\t","\\t");
                    symbol = symbol.replaceFirst("\\r","\\r");
                    return "LNoViableAltException{
                        " +"input='" + input.substring(lastCharIndex, index) + "'," +"token=" + symbol + "'/>";
                    }
}