import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    final ATN atn = getInterpreter().getAtn();
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.getState(State);
    IntervalSet following = atn.nextTokens(s);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(Token.EPSILON)) {
        return false;
    }
    while (ctx!=null && ctx.getInvokingState()>=0 && following.contains(Token.EPSILON)) {
        ATNState invokingState = atn.getState(ctx.getInvokingState());
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.nextTokens(rt.getFollowState());
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.getParent();
    }
    if (following.contains(Token.EPSILON)&&symbol==Token.EOF) {
        return true;
    }
    return false;
}
}