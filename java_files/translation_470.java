import java.util.*;

public class Translation470 {
    public Token recoverInline(Parser recognizer)throws RecognitionException {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext context=recognizer.getContext();
    context!=null;
    context=context.getParent()) {
        context.exception=e;
    }
    throw new ParseCancellationException(e);
}
}