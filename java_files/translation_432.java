import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ( getInterpreter().in != null ) {
        Lexer lexer = getInterpreter().getLexer();
        if (lexer instanceof LexerCustomAction) {
            return compileParseTreePattern(pattern, patternRuleIndex, (LexerCustomAction)lexer);
        }
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
    throw new UnsupportedOperationException("Error - no parser in context");
}
}