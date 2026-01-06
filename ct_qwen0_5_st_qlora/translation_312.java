import java.util.*;

public class Translation312 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
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