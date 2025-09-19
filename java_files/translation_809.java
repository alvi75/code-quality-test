import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATNState s = getState();
    if ( s==null || !isRuleStopState(s) ) {
        return null;
    }
    IntervalSet following = nextTokens(s);
    if (!following.contains(Token.EPSILON)) {
        return following;
    }
    IntervalSet expected = new IntervalSet();
    expected.addAll(following);
    expected.remove(Token.EPSILON);
    expected.setReadonly(true);
    return expected;
}
}