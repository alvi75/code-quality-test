import java.util.*;

public class Translation809 {
    1 public IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = Interpreter.atn;
    ATNState s = atn.states.get(state);
    return atn.nextTokens(s);
}
}