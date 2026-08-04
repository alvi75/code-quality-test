import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
    if ( outerContext == null ) outerContext = ParserRuleContext.EMPTY;
    if ( outerContext.parent == null || outerContext == ParserRuleContext.EMPTY ) return EMPTY;
    PredictionContext parent = fromRuleContext(atn, outerContext.parent);
    ATNState state = atn.states.get(outerContext.invokingState);
    RuleTransition transition = (RuleTransition)state.transition(0);
    return parent.getChild(transition.followState.stateNumber);
}
}