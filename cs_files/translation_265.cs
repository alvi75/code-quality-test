using System;
using System.Collections.Generic;

public class Translation265
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder();
    sb.Append(GetType().Name).Append(" [ARRAY]\n");
    sb.Append(" range=" + Range.ToString() + "\n");
    sb.Append(" options=" + Options + "\n");
    sb.Append(" notUsed=" + Field3NotUsed + "\n");
    sb.Append(" formula:").Append("\n");
    if (_formula != null){
        sb.Append(_formula.ToString());
    }
    sb.Append("]");
    return sb.ToString();
}
}