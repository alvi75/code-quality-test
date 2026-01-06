import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    super(stream);
    switch (lexState) {
        case QUERY:state = 0;
        break;
        case TOKEN:state = 1;
        break;
        case END:state = 2;
        break;
        default:throw new System.ArgumentException("Unknown state " + lexState);
    }
}
}