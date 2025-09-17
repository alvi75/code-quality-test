import java.util.*;

public class Translationtranslation_251 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
        final ValueEval veText1;
        try {
            veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
        }
        catch (EvaluationException e) {
            return e.getErrorEval();
        }
        final String iNumber = OperandResolver.coerceValueToString(veText1);
        Matcher m = COMPLEX_NUMBER_PATTERN.matcher(iNumber);
        boolean result = m.matches()&& (m.groupCount() > 0);
        String real = "";
        if (result) {
            String realGroup = m.group(GROUP1_REAL_INTEGER_OR_DOUBLE);
            boolean hasRealPart = realGroup.length() != 0;
            if (realGroup.length() == 0) {
                return new StringEval(String.valueOf(0));
            }
            if (hasRealPart) {
                String sign = "";
                String realSign = m.group(GROUP2_REAL_SIGN);
                if (realSign.length() != 0 && !(realSign.equals("+"))) {
                    sign = realSign;
                }
                String groupRealNumber = m.group(GROUP3_IMAGINARY_INTEGER_OR_DOUBLE);
                if (groupRealNumber.length() != 0) {
                    real = sign + groupRealNumber;
                }
                else {
                    real = sign + "1";
                }
            }
        }
        else {
            return ErrorEval.NUM_ERROR;
        }
        return new StringEval(real);
    }
}