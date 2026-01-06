import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    this(stream);
    switch (lexState) {
        case 0:setTokenBuffer(new char[QueryParserConstants.DEFAULT_TOKEN_BUFFER_SIZE], 0);
        break;
        default:throw new ArgumentException("Illegal Lexical State: " + lexState);
    }
}