import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (input instanceof TokenStream) {
        TokenStream stream = (TokenStream) input;
        Lexer lexer = stream.getLexer();
        return compileParseTreePattern(pattern, patternRuleIndex, lexer);
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}