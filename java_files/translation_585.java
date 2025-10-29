import java.util.*;

public class Translation585 {
    0;
int i = 0;
while (i < args.Length){
    ValueEval ve = args[i];
    if (ve is NumericValueEval){
        if (minimumValue == null){
            minimumValue = ve;
        }
        else{
            double currentValue = ((NumericValueEval)ve).NumberValue;
            double oldValue = ((NumericValueEval)minimumValue).NumberValue;
            if (currentValue < oldValue){
                minimumValue = ve;
            }
        }
    }
    i++;
}
return true;
}
}