import java.util.*;

public class Translationtranslation_432 {
    public ParseTreePattern compileParseTreePattern(String pattern, int ruleIndex) {
        if (getInterpreter().in != null) {
            getTokenSource();
        }
        ParseTreePatternMatcher m = new ParseTreePatternMatcher(getInterpreter(), this);
        return m.compile(pattern, ruleIndex);
    }
}