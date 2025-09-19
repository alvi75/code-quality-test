import java.util.*;

public class Translation251 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
    ValueEval veText1;
    try {
        veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
}
catch (EvaluationException e) {
    return e.getErrorEval();
}
String iNumber = OperandResolver.coerceValueToString(veText1);
Matcher matcher = Imaginary.COMPLEX_NUMBER_PATTERN.matcher(iNumber);
boolean result = matcher.find();
String imaginary = "";
if (result) {
    String realGroup = matcher.group(GROUP_2_REAL_INTEGER_OR_DOUBLE);
    boolean hasRealPart = realGroup.length() != 0;
    if (realGroup.length() == 0) {
        return new StringEval(String.valueOf(0));
    }
    if (hasRealPart) {
        String sign = "";
        String imaginarySign = matcher.group(GROUP_3_IMAGINARY_SIGN);
        if (imaginarySign.length() != 0 && !(imaginarySign.equals("+")))){
            sign = imaginarySign;
        }
        String groupImaginaryNumber = matcher.group(GROUP_4_IMAGINARY_INTEGER_OR_DOUBLE);
        boolean hasImaginaryPart = groupImaginaryNumber.length() != 0;
        if (groupImaginaryNumber.length() == 0) {
            return new StringEval(String.valueOf(0));
        }
        if (hasImaginaryPart) {
            String realNumber = sign + groupImaginaryNumber;
            double d = parseDouble(realNumber);
            if (d == null) {
                return ErrorEval.VALUE_INVALID;
            }
            return new StringEval(d+"i");
        }
}