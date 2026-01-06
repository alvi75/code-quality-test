import java.util.*;

public class Translation470 {
    public Token recoverInline(Parser recognizer) {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext context = recognizer.context;
    context != null;
    context = context.getParent()) {
        context.exception = e;
    }
    throw new ParseCanceledException(e);
}
}