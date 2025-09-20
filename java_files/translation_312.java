import java.util.*;

public class Translation312 {
    ublic ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
    try {
        OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e) {
        int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode());
        return new NumberEval(result);
    }
    return ErrorEval.VALUE_INVALID;
}
}