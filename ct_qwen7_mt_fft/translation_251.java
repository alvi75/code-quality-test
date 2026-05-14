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
    boolean result = m.find() && m.group(0).length()>0;
    String imaginary = "";
    if (result == true) {
        String imaginaryGroup = m.group(5);
        boolean hasImaginaryPart = !"".equals(imaginaryGroup) && !"i".equals(imaginaryGroup) && !"j".equals(imaginaryGroup);
        if (imaginaryGroup.length() > 0 && hasImaginaryPart) {
            String sign = "";
            String imaginarySign = m.group(2);
            if (!"+".equals(imaginarySign)) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = m.group(4);
            if (groupImaginaryNumber.length() > 0) {
                imaginary = sign + groupImaginaryNumber;
            }
            else {
                imaginary = sign + "1";
            }
        }
        else {
            return ErrorEval.NUM_ERROR;
        }
    }
    return new StringEval(imaginary);
}
}