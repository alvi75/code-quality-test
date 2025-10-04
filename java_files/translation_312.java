import java.util.*;

public class Translation312 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
    try {
        NumberEval ne = (NumberEval)arg0;
        return ne.getNumberValue();
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
}
}