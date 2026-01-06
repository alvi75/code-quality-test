import java.util.*;

public class Translation470 {
    public Token recoverInline(Parser recognizer) {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext ctx = recognizer.getContext();
    ctx != null;
    ctx = ctx.getParent()) {
        ctx.setException(e);
    }
    throw new ParseCancellationException(e);
}
}