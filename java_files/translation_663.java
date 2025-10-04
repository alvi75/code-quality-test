import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(ATN atn,PredictionContext outerContext) {
    if ( outerContext==null ) {
        outerContext = EMPTY;
    }
    if ( outerContext.parent==null || outerContext == EMPTY ) {
        return EMPTY;
    }
    PredictionContext parent = PredictionContext.fromRuleContext(atn, outerContext.parent);
    ATNState state = atn.states.get(outerContext.invokingState);
    RuleTransition transition = (RuleTransition)state.transition(0);
    return parent.getChild(transition.followState.stateNumber);
}
}