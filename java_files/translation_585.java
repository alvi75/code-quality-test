import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if(eval instanceof NumericValueEval) {
        NumericValueEval neval = (NumericValueEval) eval;
        double current = neval.getNumberValue();
        Double min = _min;
        if(min == null || min.doubleValue() > current) {
            _min = neval;
        }
    }
    return true;
}
}