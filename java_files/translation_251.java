import java.util.*;

public class Translation251 {
    2017-09-28 public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
    ValueEval veText1;
    try {
        veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e) {
        return e.getErrorEval();
    }
    String iNumber = OperandResolver.coerceValueToString(veText1);
    Matcher m = COMPLEX_NUMBER_PATTERN.matcher(iNumber);
    boolean result = m.matches() && m.group(0).length()>0;
    if (result) {
        String imaginary = "";
        String imaginaryGroup = m.group(GROUP5_IMAGINARY_PART);
        boolean hasImaginaryPart = imaginaryGroup.equals("i") || imaginaryGroup.equals("j");
        if (imaginaryGroup.length()==0) {
            return new StringEval(String.valueOf(0));
        }
        if (hasImaginaryPart) {
            String sign = "";
            String imaginarySign = m.group(GROUP3_IMAGINARY_SIGN);
            if (imaginarySign.length()!=0 && !imaginarySign.equals("+")) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = m.group(GROUP4_IMAGINARY_INTEGER_OR_DOUBLE);
            if (groupImaginaryNumber.length()!=0) {
                imaginary = sign + groupImaginaryNumber;
            }
            else {
                imaginary = sign + "1";
            }
        }
        return new StringEval(imaginary);
    }
    else {
        return ErrorEval.NUM_ERROR;
    }
}
}