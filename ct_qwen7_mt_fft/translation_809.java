import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = parser.getInterpreter().atn;
    ATNState s = atn.states.get(getState());
    return atn.nextTokens(s);
}
}