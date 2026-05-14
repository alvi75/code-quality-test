import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
    if (outerContext==null) return EMPTY;
    PredictionContext parent = fromRuleContext(atn, outerContext.getParent());
    ATNState state = atn.states.get(outerContext.invokingState);
    RuleTransition trans = (RuleTransition) state.transition(0);
    int follow = trans.followState.stateNumber;
    return new SingletonPredictionContext(parent,follow);
}
}