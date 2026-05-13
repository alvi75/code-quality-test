import java.util.*;

public class Translation312 {
    1 public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) throws EvaluationException {
    2 try {
        3 OperandResolver.getSingleValue(arg0, srcRowIndex, srcColumnIndex);
        4 return ErrorEval.NA;
        5 }
        catch (EvaluationException e) {
            6 int result = translateErrorCodeToErrorTypeValue(e.getErrorEval().getErrorCode());
            7 return new NumberEval(result);
            8 }
        }
}