import java.util.*;

public class Translation663 {
    ublic static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
    if ( outerContext==null ) return EMPTY;
    PredictionContext parent = fromRuleContext(atn, outerContext.parent);
    if ( parent==EMPTY ) return EMPTY;
    return new ArrayPredictionContext(parent, outerContext.returnState);
}
}