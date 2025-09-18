import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = getInterpreter().atn;
    ATNState s = atn.states.get( state );
    return atn.nextTokens(s);
}
}