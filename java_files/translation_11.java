import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    this.stream = stream;
    switch (lexState) {
        case 0:default:lexerState = new QueryLexer(this);
        break;
    }
}