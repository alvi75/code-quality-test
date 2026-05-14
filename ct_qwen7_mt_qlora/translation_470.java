import java.util.*;

public class Translation470 {
    1 public Token recoverInline(Parser recognizer) {
    2 final InputMismatchException e = new InputMismatchException(recognizer);
    3 for (ParserRuleContext context = recognizer.getContext();
    context != null;
    context = (ParserRuleContext) context.getParent())4 {
        5 context.setException(e);
    }
    6 throw new ParseCancellationException(e);
}
}