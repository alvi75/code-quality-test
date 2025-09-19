import java.util.*;

public class Translation663 {
    public static PredictionContext fromRuleContext(ParserPredictionContext ctx) {
    if (ctx.isEmpty()) {
        return EMPTY;
    }
    if (ctx instanceof RuleContext) {
        return ctx;
    }
    return new RuleContext(ctx);
}
}