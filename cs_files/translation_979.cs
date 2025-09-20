using System;
using System.Collections.Generic;

public class Translation979
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder();
    sb.Append("[BLANK]\n");
    sb.Append(" .row = ").Append(StringUtil.ToHexString(Row)).Append("\n");
    sb.Append(" .col = ").Append(StringUtil.ToHexString(Column)).Append("\n");
    sb.Append(" .xfindex= ").Append(StringUtil.ToHexString(XFIndex)).Append("\n");
    sb.Append("[/BLANK]\n");
    return sb.ToString();
}
}