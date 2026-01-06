import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if(eval instanceof NumericValueEval) {
        if(minimumValue == null) {
            minimumValue = eval;
        }
        else {
            Double currentValue = ((NumericValueEval) eval).getNumberValue();
            Double oldValue = ((NumericValueEval) minimumValue).getNumberValue();
            if(currentValue.doubleValue() < oldValue.doubleValue()) {
                minimumValue = eval;
            }
        }
    }
    return true;
}
}