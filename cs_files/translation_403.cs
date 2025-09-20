using System;
using System.Collections.Generic;

public class Translation403
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[MMS]\n");
    buffer.Append(" .AddMenu = ").Append(StringUtil.ToHexString(AddMenu)).Append("\n");
    buffer.Append(" .DelMenu = ").Append(StringUtil.ToHexString(DelMenu)).Append("\n");
    buffer.Append("[/MMS]\n");
    return buffer.ToString();
}
}