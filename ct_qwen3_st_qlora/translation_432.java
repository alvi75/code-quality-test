import java.util.*;

public class Translation432 {
    ublic ParseTreePattern compileParseTreePattern(String pattern,int patternRuleIndex) {
    if ( getInputStream() instanceof TokenStream ) {
        TokenStream input = (TokenStream)getInputStream();
        TokenSource tokenSource = input.getTokenSource();
        if ( tokenSource instanceof Lexer ) {
            Lexer lexer = (Lexer)tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}