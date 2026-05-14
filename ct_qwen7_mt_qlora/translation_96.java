import java.util.*;

public class Translation96 {
    235 public String toString() {
    String symbol = "";
    if ( startIndex >= 0 && startIndex < ((CharStream)inputStream).size ) {
        symbol = ((CharStream)inputStream).getText(new Interval(startIndex,startIndex));
        symbol = Utils.escapeWhitespace(symbol,false);
    }
    return this.getClass().getName()+"(\""+symbol+"\")";
}
}