import java.util.*;

public class Translation663 {
    ublic static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
    if (outerContext == null)outerContext = ParserRuleContext.EMPTY;
    if (outerContext.Parent == null || outerContext == ParserRuleContext.EMPTY)return PredictionContext.EMPTY;
    PredictionContext parent = PredictionContext.fromRuleContext(atn, outerContext.Parent);
    ATNState state = atn.states.get(outerContext.invokingState);
    RuleTransition transition = (RuleTransition)state.transitions[0];
    return parent.getChild(transition.followState.stateNumber);
}
}