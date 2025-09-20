using System;
using System.Collections.Generic;

public class Translation511
{
    public override String ToFormulaString(String[] operands){
    if (space.IsSet(_options)){
        return operands[0];
    }
    else if (optiIf.IsSet(_options)){
        return ToFormulaString() + "(" + operands[0] + ")";
    }
    else if (optiSkip.IsSet(_options)){
        return ToFormulaString() + operands[0];
    }
    else{
        return ToFormulaString() + "(" + operands[0] + ")";
    }
}
}