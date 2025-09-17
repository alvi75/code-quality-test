import java.util.*;

public class Translationtranslation_432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
        if ( getInputStream()!=null ) {
            TokenSource tokenSource = getInputStream().getTokenSource();
            if ( tokenSource instanceof Lexer ) {
                Lexer lexer = (Lexer)tokenSource;
                return compileParseTreePattern(pattern, patternRuleIndex, lexer);
            }
        }
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
}