import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (!(input instanceof TokenStream)) {
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
    final Lexer lexer = ((TokenStream) input).getTokenSource().getLexer();
    return compileParseTreePattern(pattern, patternRuleIndex, lexer);
}
}