import java.util.*;

public class Translation251 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
    ValueEval veText1;
    try {
        veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    String iNumber = OperandResolver.coerceValueToString(veText1);
    Matcher m = COMPLEX_NUMBER_PATTERN.matcher(iNumber);
    boolean result = m.matches() && m.groupCount()>0;
    m.group(GROUP1_REAL_INTEGER_OR_DOUBLE);
    String real = m.group(0);
    if (real.length()==0) {
        return new StringEval(String.valueOf(0));
    }
    return new StringEval(real);
}
}