using System;
using System.Collections.Generic;

public class Translation525
{
    public override bool IncrementToken(){
    if (used){
        return false;
    }
    ClearAttributes();
    termAttribute.Append(value);
    offsetAttribute.SetOffset(0, value.Length);
    used = true;
    return true;
}
}