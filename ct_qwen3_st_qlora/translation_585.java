import java.util.*;

public class Translation585 {
    ublic boolean processMatch(ValueEval eval) {
    if (eval instanceof NumericValueEval) {
        if (minimumValue == null) {
            minimumValue = eval;
        }
        else {
            double currentValue = ((NumericValueEval) eval).getNumberValue();
            double oldValue = ((NumericValueEval) minimumValue).getNumberValue();
            if (currentValue < oldValue) {
                minimumValue = eval;
            }
        }
    }
    return true;
}
}