import java.util.*;

public class Translation312 {
    ublic ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) throws EvaluationException {
    try {
        OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
        return ErrorEval.NUM_ERROR;
    }
    catch (EvaluationException e) {
        int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode());
        return new NumberEval(result);
    }
}
}