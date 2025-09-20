import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (input instanceof TokenStream) {
        TokenSource tokenSource = ((TokenStream) input).getTokenSource();
        return compileParseTreePattern(pattern, patternRuleIndex, tokenSource);
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}