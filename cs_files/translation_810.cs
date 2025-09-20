using System;
using System.Collections.Generic;

public class Translation810
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[FILESHARING]\n");
    buffer.Append(" .readonly = ").Append(ReadOnly).Append("\n");
    buffer.Append(" .password = ").Append(StringUtil.ToHexString(Password)).Append("\n");
    buffer.Append(" .username = ").Append(Username).Append("\n");
    buffer.Append("[/FILESHARING]\n");
    return buffer.ToString();
}
}