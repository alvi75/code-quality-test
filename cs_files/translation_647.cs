using System;
using System.Collections.Generic;

public class Translation647
{
    public override String ToFormulaString(){
    String value = field_3_string;
    int len = value.Length;
    StringBuilder sb = new StringBuilder(len + 4);
    sb.Append(FormulaError.FormulaDelimiter);
    for (int i = 0;
    i < len;
    i++){
        char c = value[i];
        if (c == FormulaError.FormulaDelimiter){
            sb.Append(FormulaError.FormulaDelimiter);
        }
        sb.Append(c);
    }
    sb.Append(FormulaError.FormulaDelimiter);
    return sb.ToString();
}
}