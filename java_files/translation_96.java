import java.util.*;

public class Translation96 {
    public String toString() {
    String symbol = getToken().getText();
    if ( startOffset!=Symbol.INVALID_OFFSET ) {
        symbol = symbol.substring( tokenImage[startOffset] );
    }
    return "LexerNoViableAltException("+symbol+")";
}
}