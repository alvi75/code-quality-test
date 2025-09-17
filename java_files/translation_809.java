import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
        ATNState s = getState();
        if ( s==null || !isRuleStopState(s) ) {
            return null;
        }
        IntervalSet nextTokens = new IntervalSet();
        nextTokens.addAll(getATN().nextTokens(s));
        return nextTokens;
    }
}