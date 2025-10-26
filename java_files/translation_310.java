ublic override bool IsExpectedToken(int symbol){
    ATNSimulator atn = this._atn;
    ParserRuleContext ctx = this._ctx;
    ATNState s = atn.States[state];
    IntervalSet following = atn.NextTokens(s);
    if (following.Contains(symbol)){
        return true;
    }
    if (!following.Contains(TokenConstants.EPSILON)){
        return false;
    }
    while (ctx != null && ctx.invokingState >= 0 && following.Contains(TokenConstants.EPSILON)){
        ATNState invokingState = atn.States[ctx.invokingState];
        RuleTransition rt = (RuleTransition)invokingState.Transition(0);
        following = atn.NextTokens(rt.followState);
        if (following.Contains(symbol)){
            return true;
        }
        ctx = (ParserRuleContext)ctx.Parent;
    }
    if (following.Contains(TokenConstants.EPSILON) && symbol == TokenConstants.EOF){
        return true;
    }
    return false;
}