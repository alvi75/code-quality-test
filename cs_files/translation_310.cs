using System;
using System.Collections.Generic;

public class Translation310
{
    public virtual bool IsExpectedToken(int symbol){
    ATN atn = Interpreter.atn;
    ParserRuleContext ctx = _ctx;
    ATNState s = atn.states[State];
    IntervalSet following = atn.NextTokens(s);
    if (following.Contains(symbol)){
        return true;
    }
    if (!following.Contains(TokenConstants.EPSILON)){
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.Contains(TokenConstants.EPSILON)){
        ATNState invokingState = atn.states[ctx.invokingState];
        RuleTransition rt = (RuleTransition)invokingState.Transition(0);
        following = atn.NextTokens(rt.followState);
        if (following.Contains(symbol)){
            return true;
        }
        ctx = (ParserRuleContext)ctx.Parent;
    }
    if (following.Contains(TokenConstants.EPSILON) && symbol == IntStreamConstants.EOF){
        return true;
    }
    return false;
}
}