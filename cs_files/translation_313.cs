using System;
using System.Collections.Generic;

public class Translation313
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder(64);
    sb.Append(GetType().Name).Append(" [");
    sb.Append(_index);
    sb.Append(" ");
    sb.Append(_name);
    sb.Append("]");
    return sb.ToString();
}
}