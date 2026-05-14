import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    final ATN atn = _interp.getAtn();
    final int stateIndex = getState().getStateNumber();
    final ATNState s = atn.states[stateIndex];
    return atn.nextTokens(s);
}
}