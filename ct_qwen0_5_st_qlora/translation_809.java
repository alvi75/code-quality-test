import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = interpreter.atn;
    ATNState s = atn.states[state];
    return atn.nextTokens(s);
}
}