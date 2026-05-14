import java.util.*;

public class Translation432 {
    1 public ParseTreePattern compileParseTreePattern(String pattern,int patternRuleIndex) throws Exception {
    2 if ( inputStream instanceof TokenStream ) {
        3 TokenSource tokenSource = ((TokenStream)inputStream).getTokenSource();
        4 if ( tokenSource instanceof Lexer ) {
            5 return compileParseTreePattern(pattern,patternRuleIndex,(Lexer)tokenSource);
            6 }
            7 }
            8 throw new UnsupportedOperationException("parser can't discover a lexer to use");
            9 }
}