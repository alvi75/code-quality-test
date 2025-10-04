import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if(eval instanceof NumericValueEval) {
        if(minimumValue == null) {
            minimumValue = eval;
        }
        else {
            double current = ((NumericValueEval) eval).getNumberValue();
            double min = minimumValue.getNumberValue();
            if(current < min) {
                minimumValue = eval;
            }
        }
    }
    return true;
}
}