import java.util.*;

public class Translation470 {
    01 public Token recoverInline(Parser recognizer) {
    02 InputMismatchException e = new InputMismatchException(recognizer);
    03 for (ParserRuleContext context = recognizer.context;
    context != null;
    context = context.parent) {
        04 context.exception = e;
        05 }
        06 throw new ParseCanceledException(e);
        07 }
}