using System;
using System.Collections.Generic;

public class Translation312
{
    public override ValueEval Evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0){
    try{
        OperandResolver.CoerceValueToDouble(arg0, srcRowIndex, srcColumnIndex);
        return ErrorEval.NA;
    }
    catch (EvaluationException e){
        int result = TranslateErrorCodeToErrorTypeValue(e.GetErrorEval().ErrorCode);
        return new NumberEval(result);
    }
}
}