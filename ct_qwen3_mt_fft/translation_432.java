import java.util.*;

public class Translation432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if ( getInputStream() instanceof CommonTokenStream ) {
        CommonTokenStream tokens = (CommonTokenStream)getInputStream();
        TokenSource tokenSource = tokens.getTokenSource();
        if ( tokenSource instanceof Lexer ) {
            Lexer lexer = (Lexer)tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, lexer);
        }
        else if ( tokenSource instanceof Antlr4.Runtime.Atn.LexerCustomAction ) {
            Antlr4.Runtime.Atn.LexerCustomAction action = (Antlr4.Runtime.Atn.LexerCustomAction)tokenSource;
            return compileParseTreePattern(pattern, patternRuleIndex, action.getLexer());
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