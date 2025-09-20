using System;
using System.Collections.Generic;

public class Translation251
{
    public override ValueEval Evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inumberVE){
    ValueEval veText1;
    try{
        veText1 = OperandResolver.GetSingleValue(inumberVE, srcRowIndex, srcColumnIndex);
    }
    catch (EvaluationException e){
        return e.GetErrorEval();
    }
    String iNumber = OperandResolver.CoerceValueToString(veText1);
    System.Text.RegularExpressions.Match m = Imaginary.COMPLEX_NUMBER_PATTERN.Match(iNumber);
    bool result = m.Success && !string.IsNullOrEmpty(m.Groups[0].Value);
    String real = "";
    if (result == true){
        String realGroup = m.Groups[(2)].Value;
        bool hasRealPart = realGroup.Length != 0 && !(realGroup.Equals("i", StringComparison.Ordinal));
        if (realGroup.Length == 0){
            return new StringEval(Convert.ToString(0));
        }
        if (hasRealPart){
            String sign = "";
            String realSign = m.Groups[(Imaginary.GROUP1_REAL_SIGN)].Value;
            if (realSign.Length != 0 && !(realSign.Equals("+"))){
                sign = realSign;
            }
            String groupRealNumber = m.Groups[(Imaginary.GROUP2_REAL_NUMBER)].Value;
            if (groupRealNumber.Length != 0){
                real = sign + groupRealNumber;
            }
            else{
                real = sign + "1";
            }
        }
    }
    else{
        return ErrorEval.NUM_ERROR;
    }
    return new StringEval(real);
}
}