using System;
using System.Collections.Generic;

public class Translation455
{
    public ValueEval Evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex){
    if (args.Length != 3){
        return ErrorEval.VALUE_INVALID;
    }
    return Evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2]);
}
}