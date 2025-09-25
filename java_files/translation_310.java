import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = getInterpreter().atn;
    ParserRuleContext ctx = getInterpreter().ctx;
    ATNState s = atn.getState(ctx.getStateNumber());
    IntervalSet following = atn.getNextTokens(s);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(Token.EPSILON)) {
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.contains(Token.EPSILON)) {
        ATNState invokingState = atn.getState(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.getNextTokens(rt.followState);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.parent;
    }
    if (following.contains(Token.EPSILON) && symbol == Token.EOF) {
        return true;
    }
    return false;
}
}