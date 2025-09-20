import java.util.*;

public class Translation470 {
    ublic Token recoverInline(Parser recognizer) {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (RuleContext context = recognizer.getContext();
    context!=null;
    context=context.getParent()) {
        context.setException(e);
    }
    throw new ParseCancellationException(e);
}
}