import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ( getInputStream() instanceof TokenStream ) {
        TokenSource tokenSource = ((TokenStream)getInputStream()).getTokenSource();
        if ( tokenSource instanceof Lexer ) {
            Lexer lexer = (Lexer)tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}