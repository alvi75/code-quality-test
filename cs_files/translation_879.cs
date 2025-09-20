using System;
using System.Collections.Generic;

public class Translation879
{
    public override String ToFormulaString(String[] operands){
    StringBuilder buffer = new StringBuilder();
    buffer.Append(operands[0]);
    buffer.Append(",");
    buffer.Append(operands[1]);
    return buffer.ToString();
}
}