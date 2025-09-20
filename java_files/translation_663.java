import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(RuleContext ctx, ATN atn) {
    if (ctx == null)ctx = EMPTY;
    PredictionContext parent = getParent(ctx);
    if (parent == null || parent == EMPTY)return EMPTY;
    int stateNum = ((RuleContextTransition)atn.states.get(ctx.invokingState)).followState.stateNumber;
    return new ParentContext(parent, stateNum);
}
}