import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = "";
    if (startIndex >= 0 && startIndex < getInputStream().size()) {
        symbol = getInputStream().getText(Interval.of(startIndex,startIndex));
        symbol = symbol.replaceAll("\\\\", "\\");
        symbol = symbol.replaceAll("\\\\?", "\\?");
        symbol = symbol.replaceAll("\\\\*", "\\*");
        symbol = symbol.replaceAll("\\\\+", "\\+");
        symbol = symbol.replaceAll("\\\\(", "\\(");
        symbol = symbol.replaceAll("\\\\)", "\\)");
        symbol = symbol.replaceAll("\\\\{
            ", "\\{
                ");
                symbol = symbol.replaceAll("\\\\}
                ", "\\}
                ");
                symbol = symbol.replaceAll("\\\\[", "\\[");
                symbol = symbol.replaceAll("\\\\]", "\\]");
                symbol = symbol.replaceAll("\\\\^", "\\^");
                symbol = symbol.replaceAll("\\\\$", "\\$");
                symbol = symbol.replaceAll("\\\\|", "\\|");
                symbol = symbol.replaceAll("\\\\?", "\\?");
                symbol = symbol.replaceAll("\\\\*", "\\*");
                symbol = symbol.replaceAll("\\\\+", "\\+");
                symbol = symbol.replaceAll("\\\\(", "\\(");
                symbol = symbol.replaceAll("\\\\)", "\\)");
                symbol = symbol.replaceAll("\\\\{
                    ", "\\{
                        ");
                        symbol = symbol.replaceAll("\\\\}
                        ", "\\}
                        ");
                        symbol = symbol.replaceAll("\\\\[", "\\[");
                        symbol = symbol.replaceAll("\\\\]", "\\]");
                        symbol = symbol.replaceAll("\\\\^", "\\^");
                        symbol = symbol.replaceAll("\\\\$", "\\$");
                        symbol = symbol.replaceAll("\\\\|", "\\|");
                        symbol = symbol.replaceAll("\\\\?", "\\?");
                        symbol = symbol.replaceAll("\\\\*", "\\*");
                        symbol = symbol.replaceAll("\\\\+", "\\+");
                        symbol = symbol.replaceAll("\\\\(", "\\(");
                        symbol = symbol.replaceAll("\\\\)", "\\)");
                        symbol = symbol.replaceAll("\\\\{
                            ", "\\{
                                ");
                                symbol = symbol.replaceAll("\\\\}
                                ", "\\}
                                ");
                                symbol = symbol.replaceAll("\\\\[", "\\[");
                                symbol = symbol.replaceAll("\\\\]", "\\]");
                                symbol = symbol.replaceAll("\\\\^", "\\^");
                                symbol = symbol.replaceAll("\\\\$", "\\$");
                                symbol = symbol.replaceAll("\\\\|", "\\|");
                                symbol = symbol.replaceAll("\\\\?", "\\?");
                                symbol = symbol.replaceAll("\\\\*", "\\*");
                                symbol = symbol.replaceAll("\\\\+", "\\+");
                                symbol = symbol.replaceAll("\\\\(", "\\(");
                                symbol = symbol.replaceAll("\\\\)", "\\)");
                                symbol = symbol.replaceAll("\\\\{
                                    ", "\\{
                                        ");
                                        symbol = symbol.replaceAll("\\\\}
                                        ", "\\}
                                        ");
                                        symbol = symbol.replaceAll("\\\\[", "\\[");
                                        symbol = symbol.replaceAll("\\\\]", "\\]");
                                        symbol
}