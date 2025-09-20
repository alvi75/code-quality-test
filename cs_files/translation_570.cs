using System;
using System.Collections.Generic;

public class Translation570
{
    public override ValueEval Evaluate(ValueEval[] args, OperationEvaluationContext ec){
    if (args.Length < 1){
        return ErrorEval.VALUE_INVALID;
    }
    bool isA1style;
    String text;
    try{
        ValueEval ve = OperandResolver.GetSingleValue(args[0], ec.RowIndex, ec.ColumnIndex);
        text = OperandResolver.CoerceValueToString(ve);
        switch (args.Length){
            case 1:isA1style = true;
            break;
            case 2:isA1style = EvaluateBooleanArg(args[1], ec);
            break;
            default:return ErrorEval.VALUE_INVALID;
        }
    }
    catch (EvaluationException e){
        return e.GetErrorEval();
    }
    return EvaluateIndirect(ec, text, isA1style);
}
}