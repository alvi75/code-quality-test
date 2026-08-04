import java.util.*;

public class Translation470 {
    public void recoverInline(Parser recognizer) {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext context = recognizer.getContext();
    context != null;
    context = (ParserRuleContext)context.getParent()) {
        context.exception = e;
    }
    throw new ParseCanceledException(e);
}
}