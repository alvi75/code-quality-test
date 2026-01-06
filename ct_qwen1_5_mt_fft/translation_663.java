import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(ParserRuleContext outerContext) {
    if (outerContext==null)outerContext=ParserRuleContext.EMPTY;
    if (outerContext.parent==null||outerContext.parent==ParserRuleContext.EMPTY)return EMPTY;
    PredictionContext parent = predictionContextFromATN(outerContext.atn, outerContext.parent);
    ATNState state = outerContext.atn.states.get(outerContext.invokingState);
    RuleTransition transition = state.transition(0);
    return parent.getChild(transition.target);
}
}