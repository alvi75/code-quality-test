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
    String imaginary = "";
    if (result == true) {
        String imaginaryGroup = m.group(m.groupCount()-1);
        boolean hasImaginaryPart = imaginaryGroup.equals("i") || imaginaryGroup.equals("j");
        if (imaginaryGroup.length()==0) {
            return new StringEval(Convert.toString(0));
        }
        if (hasImaginaryPart) {
            String sign = "";
            String imaginarySign = m.group(m.groupCount()-2);
            if (imaginarySign.length()!=0 && !(imaginarySign.equals("+"))) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = m.group(m.groupCount()-3);
            if (groupImaginaryNumber.length()!=0) {
                imaginary = sign + groupImaginaryNumber;
            }
            else {
                imaginary = sign + "1";
            }
        }
    }
    else {
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(imaginary);
}
}