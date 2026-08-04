import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ( ( (ITokenStream)inputStream ) != null ) {
        ITokenSource tokenSource = ( (ITokenStream)inputStream ).tokenSource();
        if ( tokenSource instanceof Lexer ) {
            Lexer lexer = (Lexer)tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
    }
    throw new UnsupportedOperationException("Parser can't discover a lexer to use");
}
}