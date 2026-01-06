import java.util.*;

public class Translation11 {
    public QueryParserTokenManager(CharStream stream, int lexState) {
    this(stream);
    switch (lexState) {
        case DefaultTokenManager.DEFAULT_LEX_STATE:setMode(Mode.NORMAL);
        break;
        default:setMode(Mode.SPECIAL_CHAR_TOKENS_ONLY);
        break;
    }
}
}