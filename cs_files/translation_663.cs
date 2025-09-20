using System;
using System.Collections.Generic;

public class Translation663
{
    public static PredictionContext FromRuleContext(ParserRuleContext atn, RuleContext outerContext){
    if (outerContext == null){
        outerContext = RuleContext.EMPTY;
    }
    PredictionContext parent = outerContext;
    parent = PredictionContext.FromRuleContext(atn, outerContext.Parent);
    ATNState state = atn.states[outerContext.invokingState];
    RuleTransition transition = (RuleTransition)state.Transition(0);
    return SingletonPredictionContext.Create(parent, transition.followState);
}
}