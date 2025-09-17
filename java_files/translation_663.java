import java.util.*;

public class Translationtranslation_663 {
    public static PredictionContext fromRuleContext(ParserRuleContext ctx) {
        if (ctx.isEmpty()) {
            return EMPTY;
        }
        if (ctx.getParent() == null) {
            return ctx;
        }
        Parser}
        ATNState s = _atn.states.get(ctx.invokingState);
        RuleTransition rt = (RuleTransition)s.transition(0);
        return rt.target;
    }
}