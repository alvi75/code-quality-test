import java.util.*;

public class Translationtranslation_251 {
    public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE) {
        ValueEval veText1;
        try {
            veText1 = OperandResolver.getSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
        }
        catch (EvaluationException e) {
            return e.getErrorEval();
        }
        String iNumber = OperandResolver.coerceValueToString(veText1);
        Pattern p = Pattern.compile("^-?[0-9]+");
        Matcher m = p.matcher(iNumber);
        boolean result = m.matches();
        String real = "";
        if (result == true) {
            String realGroup = m.group(2);
            boolean hasRealPart = realGroup.length() != 0 && !(realGroup.equals("+")) ;
            if (realGroup.length() == 0) {
                return new StringEval(String.valueOf(0));
            }
            if (hasRealPart) {
                String sign = "";
                String realSign = m.group(GROUP1_REAL_SIGN).getValue();
                if (realSign.length() != 0 && !(realSign.equals("+"))) {
                    sign = realSign;
                }
                String groupRealNumber = m.group(GROUP2_REAL_NUMBER).getValue();
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