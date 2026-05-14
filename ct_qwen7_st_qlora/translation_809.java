import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATNState s = atn.states.get(state);
    return atn.nextTokens(s);
}
}