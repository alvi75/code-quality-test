using System;
using System.Collections.Generic;

public class Translation809
{
    public virtual IntervalSet GetExpectedTokensWithinCurrentRule(){
    ATN atn = Interpreter.atn;
    ATNState s = atn.states[State];
    IntervalSet nextTokens = atn.NextTokens(s);
    if (nextTokens.Contains(TokenConstants.EPSILON)){
        nextTokens.Remove(TokenConstants.EPSILON);
    }
    return nextTokens;
}
}