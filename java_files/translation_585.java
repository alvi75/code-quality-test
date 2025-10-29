import java.util.*;

public class Translation585 {
    public boolean processMatch(ValueEval eval) {
    if (eval instanceof NumericValueEval) {
        NumericValueEval nve = (NumericValueEval) eval;
        double currentValue = nve.getNumberValue();
        double oldValue = this.minimumValue != null ? this.minimumValue.getNumberValue() : 0.;
        if (currentValue < oldValue) {
            this.minimumValue = nve;
        }
    }
    return true;
}
}