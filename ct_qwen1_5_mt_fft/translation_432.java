import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ((getTokenStream() instanceof TokenSource) && !(getTokenStream() instanceof CommonTokenStream)) {
        TokenSource tokenSource = getTokenStream();
        getTokenStream() = new CommonTokenStream(tokenSource);
    }
    if (!(getTokenStream() instanceof CommonTokenStream)) {
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
    return compileParseTreePattern(pattern, patternRuleIndex, (Lexer)getTokenStream());
}
}