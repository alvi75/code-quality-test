using System;
using System.Collections.Generic;

public class Translation19
{
    public NotImplementedFunctionException(string functionName, Exception cause): base(functionName, cause){
    try{
        functionName = functionName.Trim();
    }
    catch (IndexOutOfRangeException){
        functionName = "UnknownFunction";
    }
}
}