import java.util.*;

public class Translationtranslation_663 {
    public static PredictionContext fromRuleContext(RuleContext _atnRuleContext, ATNState _state,PredictionContext _parent){
        if (_parent == null || _state == null) {
            return PredictionContext.EMPTY;
        }
        PredictionContext parentContext = PredictionContext.fromRuleContext(_atnRuleContext._ctx, _parent);
        if (_atnRuleContext.isPrecedenceRule) {
            if (parentContext instanceof PredicateContext) {
                return (PredicateContext) parentContext;
            }
            return new PredicateContext(parentContext, _atnRuleContext.ruleIndex, _atnRuleContext.predIndex);
        }
        else {
            return parentContext;
        }
    }
}