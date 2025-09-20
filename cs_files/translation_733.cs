using System;
using System.Collections.Generic;

public class Translation733
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[CHART]\n");
    buffer.Append(" .x = ").Append(X).Append("\n");
    buffer.Append(" .y = ").Append(Y).Append("\n");
    buffer.Append(" .width = ").Append(Width).Append("\n");
    buffer.Append(" .height = ").Append(Height).Append("\n");
    buffer.Append("[/CHART]\n");
    return buffer.ToString();
}
}