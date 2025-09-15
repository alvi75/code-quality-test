import java.util.*;

public class Translationtranslation_470 {
    public Token recoverInline(Parser recognizer)throws RecognitionException{
        ErrorRecoveryNode errorRecoveryNode = ((ErrorRecoveryNode)recognizer.getCurrentErrorRecoveryNode());
        if (errorRecoveryNode != null) {
            int ruleIndex = errorRecoveryNode.getRuleIndex();
            Context context = recognizer.getContext();
            if (context instanceof ParserRuleContext) {
                ((ParserRuleContext)context).exception = e;
            }
            throw new ParseCancellationException(e);
        }
        Context.exception = e;
        return (Token) e.getValue();
    }
}