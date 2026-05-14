import java.util.*;

public class Translation736 {
    public ValueEval evaluate(ValueEval arg0, ValueEval arg1) {
    try {
        AreaEval reA = evaluateRef(arg0);
        AreaEval reB = evaluateRef(arg1);
        AreaEval result = resolveRange(reA, reB);
        if(result==null) {
            return ErrorEval.ZERO;
        }
        return result;
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
}
}