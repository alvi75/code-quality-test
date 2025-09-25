import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states.get(state);
    IntervalSet following = atn.getNextTokens(s);
    if ( following.contains(symbol) ) {
        return true;
    }
    if ( !following.contains(TokenConstants.EPSILON) ) {
        return false;
    }
    while ( ctx != null && ctx.invokingState >= 0 && following.contains(TokenConstants.EPSILON) ) {
        ATNState invokingState = atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.getNextTokens(rt.followState);
        if ( following.contains(symbol) ) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.parent;
    }
    if ( following.contains(TokenConstants.EPSILON) && symbol == TokenConstants.EOF ) {
        return true;
    }
    return false;
}
}