import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = getInterpreter().atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states.get(stateNumber);
    IntervalSet following = atn.nextTokens(s);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(Token.EPSILON)) {
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.contains(Token.EPSILON)) {
        ATNState invokingState = atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.nextTokens(rt.followState);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = ctx.parent;
    }
    if (following.contains(Token.EPSILON) && symbol == Token.EOF) {
        return true;
    }
    return false;
}
}