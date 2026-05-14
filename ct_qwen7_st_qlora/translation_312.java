import java.util.*;

public class Translation312 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
    try {
        return OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
    }
    catch(EvaluationException e) {
        int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getCode());
        return new NumberEval(result);
    }
}
}