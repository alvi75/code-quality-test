import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if(eval instanceof NumericValueEval) {
        if(minimumValue == null) {
            minimumValue = eval;
        }
        else {
            double currentNum = ((NumericValueEval)eval).getNumberValue();
            double minNum = minimumValue.getNumberValue();
            boolean result = currentNum < minNum;
            minimumValue = result ? eval : MIN_VALUE;
            return result;
        }
        return false;
    }
}