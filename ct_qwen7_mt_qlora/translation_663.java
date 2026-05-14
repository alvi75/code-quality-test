import java.util.*;

public class Translation663 {
    1 public static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
    2 if (outerContext == null)3 outerContext = ParserRuleContext.EMPTY;
    4 if (outerContext.getParent() == null || outerContext == ParserRuleContext.EMPTY)5 return EMPTY;
    6 PredictionContext parent = fromRuleContext(atn, outerContext.getParent());
    7 ATNState state = atn.states.get(outerContext.invokingState);
    8 RuleTransition transition = (RuleTransition) state.transition(0);
    9 return parent.getChild(transition.followState.stateNumber);
}
}