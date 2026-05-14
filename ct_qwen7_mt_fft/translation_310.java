import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    ATN atn = getInterpreter().atn;
    ParserRuleContext ctx = getContext();
    ATNState s = atn.states.get(getState());
    IntervalSet following = atn.getNextTokens(s);
    boolean result = following.contains(symbol);
    if (result) return true;
    if ( !following.contains(Parser.EOF) ) return false;
    while ( ctx!=null && ctx.invokingState>=0 ) {
        ATNState invokingState = atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)invokingState.transition(0);
        following = atn.getNextTokens(rt.followState);
        if ( following.contains(symbol) ) {
            return true;
        }
        ctx = getParentCtx(ctx);
    }
    if ( following.contains(Parser.EOF) && symbol==EOF ) {
        return true;
    }
    return false;
}
}