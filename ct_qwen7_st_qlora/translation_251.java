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
    boolean result = COMPLEX_NUMBER_PATTERN.matcher(iNumber).matches();
    String imaginary = "";
    if(result==true) {
        String imaginaryGroup = getMatcherGroup(COMPLEX_NUMBER_PATTERN.matcher(iNumber), GROUP5_IMAGINARY);
        boolean hasImaginaryPart = "i".equals(imaginaryGroup) || "j".equals(imaginaryGroup);
        if(imaginaryGroup.length()==0) {
            return new StringEval(String.valueOf(0));
        }
        if(hasImaginaryPart) {
            String sign = "";
            String imaginarySign = getMatcherGroup(COMPLEX_NUMBER_PATTERN.matcher(iNumber), GROUP3_IMAGINARY_SIGN);
            if(!"+".equals(imaginarySign)) {
                sign = imaginarySign;
            }
            String groupImaginaryNumber = getMatcherGroup(COMPLEX_NUMBER_PATTERN.matcher(iNumber), GROUP4_IMAGINARY_INTEGER_OR_DOUBLE);
            if(groupImaginaryNumber.length()!=0) {
                imaginary = sign+groupImaginaryNumber;
            }
            else {
                imaginary = sign+"1";
            }
        }
    }
    else {
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(imaginary);
}
}