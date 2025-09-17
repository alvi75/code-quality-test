import java.util.*;

public class Translationtranslation_585 {
    public boolean processMatch(ValueEval eval) {
        if(eval instanceof NumericValueEval) {
            if(minimumValue == null) {
                minimumValue = eval;
            }
            else {
                double currentNum = ((NumericValueEval)eval).getNumberValue();
                double minNum = minimumValue.getNumberValue();
                boolean lessThan = currentNum < minNum;
                if(lessThan) {
                    minimumValue = eval;
                }
            }
        }
        return true;
    }
}