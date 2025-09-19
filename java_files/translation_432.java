import java.util.*;

public class Translation432 {
    public ParseTree compileParseTree(String pattern, int ruleIndex) {
    if (getInputStream() != null) {
        getTokenSource().reset(getInputStream());
    }
    else {
        getInterpreter().reset();
    }
    Pair<ParseTree, Integer> pair = parse(pattern, ruleIndex);
    return pair.a;
}
}