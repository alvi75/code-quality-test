import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if (eval instanceof NumberEval) {
        if (minimumValue == null) {
            minimumValue = eval;
        }
        else {
            double currentValue = ((NumberEval)eval).doubleValue();
            double oldValue = ((NumberEval)minimumValue).doubleValue();
            if (currentValue < oldValue) {
                minimumValue = eval;
            }
        }
    }
    return true;
}
}