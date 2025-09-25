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
    boolean result = COMPLEX_NUMBER_PATTERN.matcher(iNumber).matches() && iNumber.length() > 0;
    String imaginary = "";
    if (result) {
        String imaginaryGroup = iNumber.substring(0, iNumber.indexOf('i') - 1);
        boolean hasImaginaryPart = imaginaryGroup.endsWith("i");
        if (hasImaginaryPart) {
            String sign = "";
            String imaginarySign = imaginaryGroup.substring(0, imaginaryGroup.lastIndexOf('i') - 1);
            if (imaginarySign.length() != 0 && !imaginarySign.equals("+")) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = imaginaryGroup.substring(imaginaryGroup.lastIndexOf('i') + 1);
            if (groupImaginaryNumber.length() != 0) {
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