import java.util.*;

public class Translation736 {
    23 public ValueEval evaluate(int srcRowIndex, int srcColumnIndex,ValueEval arg0, ValueEval arg1) throws EvaluationException {
    45 AreaEval reA = evaluateRef(arg0);
    46 AreaEval reB = evaluateRef(arg1);
    47 AreaEval result = resolveRange(reA, reB);
    48 if(result == null) {
        49 return ErrorEval.NULL_INTERSECTION;
        50 }
        51 return result;
    }
}