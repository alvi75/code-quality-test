using System;
using System.Collections.Generic;

public class Translation958
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[RightMargin]\n");
    buffer.Append(" .margin = ").Append(" (").Append(Margin).Append(" )\n");
    buffer.Append("[/RightMargin]\n");
    return buffer.ToString();
}
}