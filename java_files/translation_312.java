import java.util.*;

public class Translationtranslation_312 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
        try {
            final OperandResolver or = new OperandResolver(getSheetEvaluator(), srcRowIndex, srcColumnIndex);
            return or.getSingleValue(arg0, OR_ERROR_INDEX);
        }
        catch (EvaluationException e) {
            int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode());
            return new NumberEval(result);
        }
    }
}