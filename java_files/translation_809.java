import java.util.*;

public class Translation809 {
    01 public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = interpreter.atn;
    ATNState s = atn.states.get(state);
    return atn.nextTokens(s);
}
}