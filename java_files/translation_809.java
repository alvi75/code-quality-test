import java.util.*;

public class Translation809 {
    public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = interpreter.getATN();
    ATNState s = atn.states[state];
    return atn.nextTokens(s);
}
}