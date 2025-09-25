import java.util.*;

public class Translation585 {
    public boolean processMatch(NumberEval eval) {
    if (eval instanceof NumericValueEval) {
        if (minimumValue == null) {
            minimumValue = eval;
        }
        else {
            double currentValue = ((NumericValueEval)eval).doubleValue();
            double oldValue = ((NumericValueEval)minimumValue).doubleValue();
            if (currentValue < oldValue) {
                minimumValue = eval;
            }
        }
        return true;
    }
}
}