import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (!(input instanceof TokenStream)) {
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
    TokenSource tokenSource = ((TokenStream) input).getTokenSource();
    if (tokenSource instanceof Lexer) {
        Lexer lexer = (Lexer) tokenSource;
        return compileParseTreePattern(pattern, patternRuleIndex, lexer);
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}