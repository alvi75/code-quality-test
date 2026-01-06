import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ((getTokenStream() instanceof TokenStream) && getTokenStream().tokenSource instanceof Lexer) {
        Lexer lexer = (Lexer) getTokenStream().tokenSource;
        return compileParseTreePattern(pattern, patternRuleIndex, lexer);
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}