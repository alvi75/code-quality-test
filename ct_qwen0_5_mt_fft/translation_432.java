import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (input instanceof TokenStream) {
        TokenSource tokenSource = ((TokenStream) input).getTokenSource();
        if (tokenSource instanceof Lexer) {
            return compileParseTreePattern(pattern, patternRuleIndex, (Lexer) tokenSource);
        }
        else {
            throw new UnsupportedOperationException("Parser can't discover a lexer to use");
        }
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}