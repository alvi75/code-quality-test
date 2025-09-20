using System;
using System.Collections.Generic;

public class Translation736
{
    public override ValueEval Evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1){
    try{
        AreaEval reA = EvaluateRef(arg0);
        AreaEval reB = EvaluateRef(arg1);
        AreaEval result = ResolveRange(reA, reB);
        if (result == null){
            return ErrorEval.VALUE_INVALID;
        }
        return result;
    }
    catch (EvaluationException e){
        return e.GetErrorEval();
    }
}
}