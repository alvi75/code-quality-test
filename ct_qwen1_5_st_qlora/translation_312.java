import java.util.*;

public class Translation312 {
    public final ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) {
    try {
        double d = OperandResolver.parseDouble(arg0, srcRowIndex, srcColumnIndex);
        if (d == 0) {
            return NumberEval.ZERO;
        }
        else if (d < 0) {
            return new NumberEval(d * -1);
        }
        else {
            return new NumberEval(d);
        }
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
}
}