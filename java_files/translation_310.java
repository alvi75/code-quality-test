import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states.get(state);
    IntervalSet following = atn.NextTokens(s);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(ATN.INVALID_ALT_NUMBER)) {
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.contains(ATN.INVALID_ALT_NUMBER)) {
        ATNState invokingState = atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.NextTokens(rt.followState);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.parent;
    }
    if (following.contains(ATN.INVALID_ALT_NUMBER) && symbol == Token.EOF) {
        return true;
    }
    return false;
}
}