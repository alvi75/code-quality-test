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
    boolean result = COMPLEX_NUMBER_PATTERN.matcher(iNumber).find()&& !"".equals(COMPLEX_NUMBER_PATTERN.matcher(iNumber).group());
    String imaginary = "";
    if (result) {
        String imaginaryGroup = COMPLEX_NUMBER_PATTERN.matcher(iNumber).group(5);
        boolean hasImaginaryPart = imaginaryGroup.equals("i")|| imaginaryGroup.equals("j");
        if (!"".equals(imaginaryGroup)) {
            imaginary = imaginaryGroup;
        }
    }
    else {
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(imaginary);
}
}