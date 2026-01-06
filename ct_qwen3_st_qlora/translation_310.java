import java.util.*;

public class Translation310 {
    ublic boolean isExpectedToken(int symbol) {
    ATN atn = Interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states.get(_ctx.invokingState);
    IntervalSet following = atn.getNextTokens(s, null, ctx.ruleContext);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(Token.EOF)) {
        return false;
    }
    while(ctx.parent != null && ctx.invokingState >= 0 && following.contains(Token.EOF)) {
        ATNState invokingState = atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.getNextTokens(rt.followState, null, ctx.parent);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext) ctx.parent;
    }
    if (following.contains(Token.EOF) && symbol == Token.EOF) {
        return true;
    }
    return false;
}
}