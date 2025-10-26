import java.util.*;

public class Translation432 {
    ublic ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (input instanceof TokenStream) {
        TokenSource tokenSource = ((TokenStream) input).getTokenSource();
        if (tokenSource instanceof Lexer) {
            Lexer lexer = (Lexer) tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}