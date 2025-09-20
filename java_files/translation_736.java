import java.util.*;

public class Translation736 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex,ValueEval arg0, ValueEval arg1) {
    try {
        final AreaEval reA = evaluateRef(arg0);
        final AreaEval reB = evaluateRef(arg1);
        final AreaEval result = resolveRange(reA, reB);
        if (result == null) {
            return ErrorEval.NULL_INTERSECTION;
        }
        return result;
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
}
}