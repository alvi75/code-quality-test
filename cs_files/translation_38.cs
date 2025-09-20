using System;
using System.Collections.Generic;

public class Translation38
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder(64);
    sb.Append(GetType().Name).Append(" [");
    sb.Append(ValueAsString);
    sb.Append("]");
    return sb.ToString();
}
}