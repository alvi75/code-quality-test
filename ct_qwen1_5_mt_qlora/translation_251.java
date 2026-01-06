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
    Pattern pattern = Pattern.compile("^(-?\\d+(\\.\\d+)?)((e|E)(-?\\d+))?$");
    Matcher matcher = pattern.matcher(iNumber);
    boolean result = matcher.matches() && matcher.groupCount()>0;
    String imaginary = "";
    if (result == true) {
        String imaginaryGroup = matcher.group(GROUP3_IMAGINARY_SIGN);
        boolean hasImaginaryPart = imaginaryGroup.equals("i") || imaginaryGroup.equals("j");
        if (imaginaryGroup.length()==0) {
            return new StringEval("0");
        }
        if (hasImaginaryPart) {
            String sign = "";
            String imaginarySign = matcher.group(GROUP4_IMAGINARY_SIGN);
            if (imaginarySign.length()!=0 && !imaginarySign.equals("+")) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = matcher.group(GROUP5_IMAGINARY_INTEGER_OR_DOUBLE);
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