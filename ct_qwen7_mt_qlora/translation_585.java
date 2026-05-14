import java.util.*;

public class Translation585 {
    1 public boolean processMatch(ValueEval eval) {
    2 if (eval instanceof NumericValueEval) {
        3 if (minimumValue == null) {
            4 minimumValue = eval;
            5 }
            else {
                6 double currentValue = ((NumericValueEval) eval).getNumberValue();
                7 double oldValue = ((NumericValueEval) minimumValue).getNumberValue();
                8 if (currentValue < oldValue) {
                    9 minimumValue = eval;
                    10 }
                    11 }
                    12 }
                    13 return true;
                }
}