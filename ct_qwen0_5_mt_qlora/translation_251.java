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
    Pattern p = Pattern.compile(COMPLEX_NUMBER_PATTERN);
    Matcher m = p.matcher(iNumber);
    boolean result = m.matches();
    String imaginary = "";
    if (result) {
        String imaginaryGroup = m.group(5);
        boolean hasImaginaryPart = imaginaryGroup.equals("i") || imaginaryGroup.equals("j");
        if (!imaginaryGroup.isEmpty()) {
            return ErrorEval.NUM_ERROR;
        }
        String groupImaginaryNumber = m.group(4);
        if (groupImaginaryNumber.length() > 0) {
            imaginary = hasImaginaryPart ? imaginaryGroup + groupImaginaryNumber : imaginaryGroup + "1";
        }
    }
    else {
        return ErrorEval.NUM_ERROR;
    }
    return ErrorEval.VALUE_RETURNED;
}
}