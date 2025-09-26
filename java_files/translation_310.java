import java.util.*;

public class Translation310 {
    1 public boolean isExpectedToken(int symbol) {
    ATN atn = Interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states.getState(state);
    IntervalSet following = atn.getFollowingTokens(s);
    if (following.contains(symbol)) return true;
    if (!following.contains(TokenConstants.EPSILON)) return false;
    while (ctx != null && ctx.invokingState >= 0 && following.contains(TokenConstants.EPSILON)) {
        ATNState invokingState = atn.states.getState(ctx.invokingState);
        RuleTransition rt = invokingState.transitions.get(0).ruleTransition;
        following = atn.getFollowingTokens(rt.followState);
        if (following.contains(symbol)) return true;
        ctx = (ParserRuleContext) ctx.parent;
    }
    if (following.contains(TokenConstants.EPSILON) && symbol == TokenConstants.EOF) return true;
    return false;
}
}