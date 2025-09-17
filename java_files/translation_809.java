import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
        ATN atn = getInterpreter().atn;
        ATNState s = atn.states.get( state );
        return atn.nextTokens(s);
    }
}