import java.util.*;

public class Translation470 {
    public Token recoverInline(Parser recognizer)throws InputMismatchException{
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext ctx = recognizer.getContext();
    ctx!=null;
    ctx = (ParserRuleContext)ctx.getParent()) {
        ctx.setErrorType(e);
    }
    throw e;
}
}