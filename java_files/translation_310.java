import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states[state];
    IntervalSet following = atn.nextTokens(s);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(TokenSymbols.EPSILON)) {
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.contains(TokenSymbols.EPSILON)) {
        ATNState invokingState = atn.states[ctx.invokingState];
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.nextTokens(rt.followState);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.parent;
    }
    if (following.contains(TokenSymbols.EPSILON) && symbol == TokenSymbols.EOF) {
        return true;
    }
    return false;
}
}