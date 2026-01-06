import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    this.stream = stream;
    switch (lexState) {
        case 0: this.lexState = LexState.SYNTAX_ERROR;
        break;
        default: throw new System.ArgumentException("Unknown lexical state: " + lexState);
    }
    this._jj_ntk = -1;
}
}