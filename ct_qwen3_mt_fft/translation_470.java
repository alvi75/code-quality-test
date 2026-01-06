import java.util.*;

public class Translation470 {
    1 public Token recoverInline(Parser recognizer) {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext context = recognizer.getContext();
    context != null;
    context = context.getParent()) {
        context.exception = e;
    }
    throw new ParseCancellationException(e);
}
}