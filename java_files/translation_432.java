import java.util.*;

public class Translationtranslation_432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
        if (getInputStream()!=null) {
            try {
                ParseTreePatternMatcher m = createPatternMatcher(getInputStream(), pattern, patternRuleIndex);
                return m.compile();
            }
            catch (RecognitionException e) {
                throw new ParseException(e);
            }
        }
        throw new UnsupportedOperationException("Parser can't discover a lexer to use");
    }
}