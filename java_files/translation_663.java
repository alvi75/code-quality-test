import java.util.*;

public class Translationtranslation_663 {
    public static PredictionContext fromRuleContext(ATN atn, RuleContext outerContext) {
        if ( outerContext==null ) return EMPTY;
        PredictionContext parent = fromRuleContext(atn, outerContext.parent);
        if ( parent==EMPTY ) return EMPTY;
        return new ArrayPredictionContext(parent, outerContext.returnState);
    }
}