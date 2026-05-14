import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (_tokenStream instanceof TokenStream) {
        TokenStream tokenStream = (TokenStream)_tokenStream;
        return compileParseTreePattern(pattern,patternRuleIndex,tokenStream.getLexer());
    }
    throw new UnsupportedOperationException("Parser doesn't have a lexer!");
}
}