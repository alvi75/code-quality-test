import java.util.*;

public class Translation312 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
    try {
        final NumberEval ne = (NumberEval) arg0;
        return ne.getNumberValue();
    }
    catch (EvaluationException e) {
        throw new RuntimeException("Bad range arg type (" + e.getErrorEval() + ")");
    }
}
}