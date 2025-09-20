using System;
using System.Collections.Generic;

public class Translation585
{
    public bool ProcessMatch(ValueEval eval){
    double result;
    try{
        result = OperandResolver.CoerceValueToDouble(eval);
        if (Double.IsNaN(result) || Double.IsInfinity(result)){
            throw new EvaluationException(ErrorEval.NUM_ERROR);
        }
        NumericFunction.CheckValue(result);
    }
    catch (EvaluationException e){
        return e.GetErrorEval();
    }
    return new NumberEval(result);
}
}