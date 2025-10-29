import java.util.*;

public class Translation432 {
    01 public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (inputStream instanceof TokenStream) {
        TokenSource tokenSource = ((TokenStream) inputStream).getTokenSource();
        if (tokenSource instanceof Lexer) {
            Lexer lexer = (Lexer) tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
        else {
            throw new UnsupportedOperationException("Parser can't discover a lexer to use");
        }
    }
    else {
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
}
}