import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    this(stream);
    switch (lexState){
        case Lexer.DEFAULT:break;
        default:throw new InvalidOperationException("Unexpected state " + lexState + ".");
    }
}
}